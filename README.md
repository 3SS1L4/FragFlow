# 📱 FragFlow — Navigation Dynamique avec Fragments

> **LAB 4 — Programmation Mobile : Android avec Java**
> Manipulation dynamique des fragments avec `FragmentManager` et `FragmentTransaction`.

https://github.com/user-attachments/assets/f457a6dd-1b52-437b-be84-84c13cff4179

---

## 📸 Aperçu

|     Fragment 1     |      Fragment 2      |
| :----------------: | :------------------: |
|   Texte + Bouton   |   SeekBar dynamique  |
| Interaction simple | Valeur en temps réel |

---

## 🛠️ Technologies utilisées

* **Langage** : Java
* **Plateforme** : Android (Min SDK 24+)
* **IDE** : Android Studio
* **UI** : XML Layouts (`LinearLayout`, `FrameLayout`, `TextView`, `Button`, `SeekBar`)
* **Navigation** : `FragmentManager` + `FragmentTransaction`

---

## 📁 Structure du projet

```
fragflow/
├── app/src/main/
│   ├── java/com/example/fragflow/
│   │   ├── MainActivity.java        # Gestion navigation fragments
│   │   ├── FragmentOne.java         # Interaction simple (bouton)
│   │   └── FragmentTwo.java         # Gestion état + SeekBar
│   ├── res/layout/
│   │   ├── activity_main.xml        # Conteneur principal
│   │   ├── fragment_one.xml         # UI Fragment 1
│   │   └── fragment_two.xml         # UI Fragment 2
│   └── AndroidManifest.xml
```

---

## ✨ Fonctionnalités

* ✅ Navigation entre fragments sans changer d’activité
* ✅ Remplacement dynamique du contenu avec `replace()`
* ✅ Gestion du bouton **Back**
* ✅ Interaction utilisateur (clic bouton)
* ✅ Composant interactif `SeekBar`
* ✅ Mise à jour dynamique de l’interface
* ✅ Sauvegarde et restauration de l’état

---

## 🚀 Comment lancer le projet

1. Clone le dépôt :

   ```bash
   git clone https://github.com/your-username/fragflow.git
   ```
2. Ouvre avec **Android Studio**
3. Synchronise Gradle
4. Lance sur un émulateur ou appareil réel (**Min SDK 24+**)

---

## 🧠 Ce que j’ai appris

### 🔹 1. Utilisation des Fragments

* Comprendre la différence entre **Activity** et **Fragment**
* Créer des interfaces modulaires et réutilisables
* Charger un fragment dynamiquement dans un conteneur

---

### 🔹 2. Navigation dynamique

* Utiliser `FragmentManager` pour gérer les fragments
* Effectuer des opérations avec `FragmentTransaction`
* Remplacer un fragment avec `replace()`
* Gérer l’historique avec `addToBackStack()`

---

### 🔹 3. Gestion des interactions utilisateur

* Capturer les événements avec `setOnClickListener`
* Mettre à jour l’interface en temps réel
* Utiliser des composants interactifs comme `SeekBar`

---

### 🔹 4. Cycle de vie des fragments

* Comprendre les méthodes clés comme `onViewCreated()`
* Savoir quand initialiser les vues
* Observer le comportement lors des changements d’état

---

### 🔹 5. Gestion de l’état (important)

* Sauvegarder les données avec `onSaveInstanceState()`
* Restaurer les données après rotation de l’écran
* Éviter la perte d’informations utilisateur

---

### 🔹 6. Structuration d’une application Android

* Séparer logique (Java) et interface (XML)
* Organiser un projet proprement
* Créer un code lisible et maintenable

---

## 📝 Détail des fichiers

### `MainActivity.java`

* Gère le changement entre fragments
* Initialise l’interface principale
* Contrôle la navigation

### `FragmentOne.java`

* Interaction simple avec bouton
* Mise à jour du texte

### `FragmentTwo.java`

* Gestion d’un état dynamique
* Utilisation d’un `SeekBar`
* Sauvegarde des données

---

## 👨‍💻 Auteur

**AMSOU ISMAIL**  - Lab de développement mobile


https://github.com/user-attachments/assets/8e065173-4a0a-48de-a256-4b9d9a32b0a9

