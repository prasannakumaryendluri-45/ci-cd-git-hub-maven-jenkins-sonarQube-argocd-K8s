# Dockerfile
FROM node:21-alpine

WORKDIR /app

COPY app.js .

EXPOSE 9090

CMD ["node", "app.js"]
