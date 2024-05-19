## Activité Pratique N°3 - Spring MVC Spring Data JPA Thymeleaf
###### L'activité pratique N°3 porte sur la création d'une application Web JEE basée sur Spring MVC, Thymeleaf et Spring Data JPA pour la gestion des patients. Cette activité vous permettra de comprendre comment créer des interfaces web dynamiques, gérer les données des patients, et sécuriser l'application avec Spring Security.
### Partie 1 : Création de l'application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA:
#### Création de l'entité JPA Patient :
###### Dans ce projet, nous avons créé une entité JPA nommée Patient avec les attributs requis : id, nom, dateNaissance, malade et score, en utilisant les annotations de Lombok et JPA pour la gestion des entités
#### Configuration de l'unité de persistance :
###### Nous avons configuré l'unité de persistance dans le fichier application.properties pour utiliser la base de données H2 en mémoire.
#### Création de l'interface JPA Repository :
###### Nous avons créé une interface PatientRepository en étendant JpaRepository pour fournir les opérations CRUD de base.
#### Afficher les patients :
###### Nous avons implémenté une vue Thymeleaf pour afficher la liste des patients. Un contrôleur Spring MVC a été créé pour gérer les requêtes liées à l'affichage des patients.
<img width="875" alt="1" src="https://github.com/Elamranihouda/TP3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/96799465/7e98e520-7f91-4129-b94e-311e54e0a64">

#### Faire la pagination :
###### Nous avons ajouté la pagination à la vue pour afficher les patients par pages. Cela permet de naviguer facilement à travers une grande liste de patients.
<img width="866" alt="2" src="https://github.com/Elamranihouda/TP3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/96799465/86fa13d7-0e52-451d-9076-bbeeeaf9be54">

#### Chercher les patients :
###### Nous avons ajouté une fonctionnalité de recherche pour filtrer les patients par nom. Cela permet aux utilisateurs de trouver facilement des patients spécifiques.
<img width="860" alt="3" src="https://github.com/Elamranihouda/TP3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/96799465/9e4c77db-45ae-4047-8cc2-db4e51edf089">

#### Supprimer un patient :
###### Nous avons implémenté la suppression des patients depuis la vue. Les utilisateurs peuvent désormais supprimer des patients directement à partir de la liste.
<img width="829" alt="4" src="https://github.com/Elamranihouda/TP3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/96799465/77755581-24d9-40d1-aa9b-b34d046489d5">

#### Faire des améliorations supplémentaires :
###### Nous avons ajouté des fonctionnalités supplémentaires comme l'affichage des icônes pour améliorer l'expérience utilisateur.

### Partie 2 : Création de pages templates et validation des formulaires
#### Page template : 
###### Nous avons Créé une page template avec Thymeleaf pour les opérations sur les patients. Cela inclut des formulaires pour ajouter ou modifier des patients.
<img width="866" alt="temp" src="https://github.com/Elamranihouda/TP3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/96799465/460c27cf-92cb-45f0-b1dc-677254f4de50">

#### Validation des formulaires :
###### Nous avons implémenté la validation des formulaires avec Spring Validator et Thymeleaf. et ajouté des annotations de validation aux champs de l'entité Patient.

### Partie 3 : Sécurité avec Spring Security
#### InMemory Authentication :
###### Nous avons configuré Spring Security pour utiliser l'authentification en mémoire en définissant les utilisateurs et les rôles directement dans le fichier de configuration. Cela permet une configuration rapide et simple pour les environnements de développement et de test.
<img width="767" alt="inm" src="https://github.com/Elamranihouda/TP3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/96799465/3fd7db7a-960e-456e-bf4e-0dada5094715">

#### JDBC Authentication :
###### Pour l'authentification via JDBC, nous avons configuré Spring Security pour se connecter à une base de données relationnelle. Nous avons créé les tables nécessaires dans la base de données pour stocker les utilisateurs et les rôles, et nous avons configuré les propriétés de connexion dans le fichier de configuration de Spring Security.
<img width="863" alt="jdbc" src="https://github.com/Elamranihouda/TP3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/96799465/4156e6d4-62a1-4a34-9011-0bd0f73488fb">

#### UserDetails Service :
###### Nous avons implémenté l'interface UserDetailsService pour gérer les utilisateurs personnalisés. Ce service récupère les détails de l'utilisateur à partir de la source de données choisie, ce qui peut être une base de données, un service externe, etc. Ensuite, nous avons configuré Spring Security pour utiliser ce service pour l'authentification, permettant ainsi une gestion flexible et extensible des utilisateurs.
<img width="773" alt="userD" src="https://github.com/Elamranihouda/TP3-Spring-MVC-Spring-Data-JPA-Thymeleaf/assets/96799465/52302380-2cb4-40b6-9655-4884cdba06c7">
b">
