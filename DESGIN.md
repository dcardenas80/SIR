# TP4SIR DESIGN

La description de classes utilisées pour cette application sont distribuées en sept pacquages

## Pacquages 
### fr.istic.sir.tp4.datamodel 
Dans ce pacquage on peut trouver les entités du modèle de base de données.
- ##### ElectronicDevice: un dispositif électronique qui se situe sur la maison.
- ##### Home: la maison où on trouve un ou plusieurs chauffages et dispositif électroniques.
- ##### Heater: un chauffage qui va être à la maison.
- ##### Person: une personne que peut avoir une ou plusieurs maisons et aussi une au plusieurs relations d'amitié avec d'autres personnes.

### fr.istic.sir.tp4.rest
Dans ce pacquage on trouve la classe OPowerWS
 - ##### OPowerWS: cette classe contient les méthodes de l'API Rest exposés à l'utilisateur.
 
### fr.istic.sir.tp4.rest.ObjectsJson

Dans ce pacquage on trouve les classes utilisées pour le WS pour donner les réponses JSON, ces classes sont simplement deux POJO.

- ##### PersonJSON
- ##### ResponseJSON

### fr.istic.sir.tp4.jpa
Dans ce pacquage on trouve l'entityManager de l'application.
- ##### EntityManagerHelper cette classe est charge d'appeler l'unité de persistance et aussi de créer l'entity manager qui sera charge de commencer les transactions, faire requêtes et faire commit.

### fr.istic.sir.tp4.jpa.dao

Dans ce pacquage on trouve 4 classes, ces classes sont les objets d'accès au data DAO, utilisées pour faire de requêtes d'insertion, sélection, modification et suppression à la base de données.

- ##### PersonDAO
- ##### HeaterDAO
- ##### HomeDAO
- ##### ElectronicDeviceDAO

### fr.istic.sir.tp4.jpa.dao.interfaces

Dans ce pacquage on trouve une interface qui est utilisée par les DAO et que définie les opérations communes à avoir.

- ##### GenericDAO

### fr.istic.sir.tp4.web

Ce pacquage contient les servlets utilisés pour recevoir les requétes post faits sur les pages HTML.

- ##### MyForm contient la reponse HelloSir
- ##### PersonServlet: retourne les personnes qui ont été crées dans la base de données
- ##### UpdatedPerson: fait la modification d'une personne dans la base de données
- ##### UserInfo: fait l'insertion d'une personne dans la base de données

### Fichiers HTML

Fichiers HTML avec formulaires qui dans son action redirigent aux servlets.

- ##### index.html
- ##### getPersons.html
- ##### newPerson.html
- ##### UpdatedPerson.html


### Diagramme de classes
![alt text](/TP4SIR.jpg)

