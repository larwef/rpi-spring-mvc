FROM resin/rpi-raspbian:wheezy

RUN apt-get update && apt-get install -y \
    oracle-java8-jdk \
    --no-install-recommends && \
    rm -rf /var/lib/apt/lists/*

ENV USER=appuser \
    HOME=/home/appuser

RUN useradd $USER

COPY toRoot/* $HOME/

USER $USER
WORKDIR /home/$USER

ENTRYPOINT ["sh", "./runapp.sh"]
