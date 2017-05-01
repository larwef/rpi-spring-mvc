FROM alpine

RUN apk add --update \
    openjdk8-jre \
    && rm -rf /var/cache/apk/*

ENV USER=appuser
ENV HOME=/home/$USER
RUN adduser -S $USER

COPY toRoot/* $HOME/

## Expose application port
EXPOSE 9094 9094

USER $USER
WORKDIR /home/$USER

ENTRYPOINT ["/bin/sh", "./runapp.sh"]
