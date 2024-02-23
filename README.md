# singleton-java

Singleton est un patron de conception de création qui garantit que l’instance d’une classe n’existe qu’en un seul exemplaire, tout en fournissant un point d’accès global à cette instance.

Patron de conception singleton
 Problème
Le singleton règle deux problèmes à la fois, mais ne respecte pas le principe de responsabilité unique.

Il garantit l’unicité d’une instance pour une classe. Pour quelle raison voudrait-on maîtriser le nombre d’instances d’une classe ? En général, cette situation se présente lorsque l’on veut contrôler l’accès à une ressource partagée — une base de données ou un fichier par exemple.

Son fonctionnement est le suivant : vous créez un objet, mais après un certain temps, vous décidez d’en créer un autre. Plutôt que de vous retrouver avec un objet flambant neuf, vous récupérez celui qui existe déjà.

Vous noterez qu’il est impossible d’implémenter ce comportement avec un constructeur normal, puisqu’un constructeur doit théoriquement toujours retourner un nouvel objet.

Accès global à un objet
Les clients ne se rendent pas forcément compte qu’ils travaillent toujours avec le même objet.

Il fournit un point d’accès global à cette instance. Vous rappelez-vous ces variables globales que vous (bon, d’accord : moi) avez utilisées pour stocker des objets essentiels ? Elles sont très pratiques mais peu fiables, puisque n’importe quelle partie du code peut potentiellement écraser leur contenu et faire planter l’application.

Le singleton vous permet d’accéder à l’objet n’importe où dans le programme, telle une variable globale. Cependant, il protège son instance et l’empêche d’être modifiée.

Un autre aspect majeur vient se glisser dans l’équation : le code qui résout le problème numéro 1 ne doit pas se retrouver éparpillé dans tout le programme. En effet, on préfèrera tout mettre dans une même classe, surtout si le reste du code repose dessus.

Aujourd’hui, le singleton est devenu très populaire et le terme singleton est même parfois employé pour une entité ne résolvant qu’un seul des problèmes listés.
