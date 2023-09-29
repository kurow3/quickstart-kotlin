ARG java_version="17"
FROM openjdk:${java_version}-slim

RUN set -eux \
 && DEBIAN_FRONTEND="noninteractive" \
 && apt-get update \
 && apt-get install -y locales sudo \
 && apt-get install -y git \
 && apt-get install -y curl libarchive-tools \
 && apt-get clean \
 && rm -rf /var/lib/apt/lists/*

ARG kotlin_version="1.9.20"
ARG kotlin_home="/usr/local/kotlin-${kotlin_version}"
ARG kotlin_dl_url="https://github.com/JetBrains/kotlin/releases/download/v${kotlin_version}/kotlin-compiler-${kotlin_version}.zip"
RUN set -eux \
 && mkdir -p "${kotlin_home}" \
 && curl -sL "${kotlin_dl_url}" | bsdtar -xvf - -C "${kotlin_home}" --strip-components 1 \
 && find "${kotlin_home}/bin" -name "*.bat" -type f -delete \
 && chmod -R 0775 "${kotlin_home}/bin"

ARG gradle_version="8.2.1"
ARG gradle_home="/usr/local/gradle-${gradle_version}"
ARG gradle_dl_url="https://services.gradle.org/distributions/gradle-${gradle_version}-bin.zip"
RUN set -eux \
 && mkdir -p "${gradle_home}" \
 && curl -sL "${gradle_dl_url}" | bsdtar -xvf - -C "${gradle_home}" --strip-components 1 \
 && find "${gradle_home}/bin" -name "*.bat" -type f -delete \
 && chmod -R 0775 "${gradle_home}/bin"

ARG system_lang="C.UTF-8"
RUN set -eux \
 && LANG_REGEX=`echo "${system_lang}" | sed -E -e "s/([\^$.?*+|[\]\{\}()\/\\])/\\\1/g"` \
 && sed -E -i "s/^#+[\t ]*(${LANG_REGEX}.*)$/\1/g" /etc/locale.gen \
 && locale-gen \
 && update-locale LANG="${system_lang}"

ARG system_tz="Etc/UTC"
RUN set -eux \
 && echo "${system_tz}" > /etc/timezone

ARG user_name="vscode"
ARG user_uid="1000"
ARG user_gid="${user_uid}"
ARG user_shell="/bin/bash"
RUN set -eux \
 && groupadd --gid "${user_gid}" "${user_name}" \
 && useradd --uid "${user_uid}" --gid "${user_gid}" --shell "${user_shell}" -m "${user_name}" \
 && echo "${user_name} ALL=(root) NOPASSWD:ALL" > "/etc/sudoers.d/${user_name}" \
 && chmod 0440 "/etc/sudoers.d/${user_name}"

ARG workspace_dir="/workspace"
RUN set -eux \
 && mkdir -p "${workspace_dir}" \
 && chown "${user_uid}":"${user_gid}" "${workspace_dir}"

USER "${user_name}"
ENV LANG="${system_lang}" \
    TZ="${system_tz}" \
    KOTLIN_VERSION="${kotlin_version}" \
    KOTLIN_HOME="${kotlin_home}" \
    GRADLE_VERSION="${gradle_version}" \
    GRADLE_HOME="${gradle_home}" \
    PATH="${gradle_home}/bin:${kotlin_home}/bin:${PATH}"
WORKDIR "${workspace_dir}"

CMD ["bash"]
