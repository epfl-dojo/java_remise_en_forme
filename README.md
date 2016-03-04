# Exercice java: Remise en forme
Un institut de remise en forme demande de développer un programme qui effectue différents calculs.

## IMC

IMC = masse / taille^2
(Indice de Masse Corporelle - masse [kg] - taille [m]

| Classification des situation pondérales   | IMC (kg/m2) Femme  | IMC (kg/m2) Homme  | Risque pour la santé                    |
| ----------------------------------------- |:------------------:|:------------------:|-----------------------------------------|
| Maigreur / insuffisance pondérale         | < 19.1             | < 20.7             | Risque de malnutrition                  |
| Poids santé                               | 19.1 - 20.8        | 20.7 - 26.4        | Risque normal                           |
| Embonpoint                                | 25.8 - 27.3        | 26.4 - 27.8        | Risque modérément augmenté              |
| Surpoids                                  | 27.3 - 32.3        | 27.8 - 31.1        | Risque augmenté                         |
| Obésité                                   | > 32.3             | > 31.1             | Risque nettement augmenté               |


## Fréquence Cardiaque
* Pour une femme: `FCmax = 226 - age`
* Pour un homme: `FCmax = 220 - age`  
  ou FC = Fréquence Cardiaque maximale et age [années]

## Description
Le programme doit demander les informations nécessaires à l'utilisateur et ensuite afficher les résultats.

Pour les personnes qui souffrent d'embonpoint et de surpoids, le programme doit afficher une suggestion d'activité cardiovasculaire se situant entre 70 et 75% de la Fréquence Cardiaque maximale.

Pour les personnes souffrant d'obésité, un message doit inviter à une consultation chez un médecin.

Les calculs sont réalisés dans des méthodes disctinctes.


## Tâches
1. Identifier les séquences nécessaires à la réalisation du processus
2. Réaliser l'algorithme et les méthodes nécessaires
3. Définir les valeurs de test, dactylographier le code source et vérifier l'exécution
