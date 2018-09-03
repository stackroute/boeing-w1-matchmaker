FROM node:latest
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY package.json /usr/src/app
RUN npm cache verify
RUN npm install
RUN npm audit fix
COPY . /usr/src/app
EXPOSE 4200
CMD ["npm","start"]
