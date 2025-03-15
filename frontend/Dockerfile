# Étape 1 : Utiliser une image Node.js
FROM node:18-alpine

# Étape 2 : Définir le répertoire de travail
WORKDIR /app

# Étape 3 : Copier package.json et installer les dépendances
COPY package.json package-lock.json ./
RUN npm install

# Étape 4 : Copier le reste du code source
COPY . .

# Étape 5 : Exposer le port utilisé par Vite
EXPOSE 5173

# Étape 6 : Lancer le serveur Vite
CMD ["npm", "run", "dev", "--", "--host"]
