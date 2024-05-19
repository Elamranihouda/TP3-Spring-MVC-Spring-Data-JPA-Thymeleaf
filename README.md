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
#### Faire la pagination :
###### Nous avons ajouté la pagination à la vue pour afficher les patients par pages. Cela permet de naviguer facilement à travers une grande liste de patients.

#### Chercher les patients :
###### Nous avons ajouté une fonctionnalité de recherche pour filtrer les patients par nom. Cela permet aux utilisateurs de trouver facilement des patients spécifiques.

#### Supprimer un patient :
###### Nous avons implémenté la suppression des patients depuis la vue. Les utilisateurs peuvent désormais supprimer des patients directement à partir de la liste.
#### Faire des améliorations supplémentaires :
###### Nous avons ajouté des fonctionnalités supplémentaires comme le tri des patients par score ou date de naissance pour améliorer l'expérience utilisateur.

### Partie 2 : Création de pages templates et validation des formulaires
#### Page template : 
###### Nous avons Créé une page template avec Thymeleaf pour les opérations sur les patients. Cela inclut des formulaires pour ajouter ou modifier des patients.
#### Validation des formulaires :
###### Nous avons implémenté la validation des formulaires avec Spring Validator et Thymeleaf. et ajouté des annotations de validation aux champs de l'entité Patient.

### Partie 3 : Sécurité avec Spring Security
