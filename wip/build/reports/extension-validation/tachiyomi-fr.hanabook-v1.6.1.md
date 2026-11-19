# Extension Validation Report

- Extension: tachiyomi-fr.hanabook-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 29
- Lint: 3
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4125236041054867131
- Source name: Hana Book
- Source language: fr
- Selected manga input: popular offset 0: Look at me, Hanasaki-san (`.../2353`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 45 | Look at me, Hanasaki-san (`.../2353`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | Ordonnance pour l'amour (`.../2367`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Look at me, Hanasaki-san (`.../2353`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Look at me, Hanasaki-san (`.../2353`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Look at me, Hanasaki-san (`.../2353 <redacted query values: n>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 45 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Look at me, Hanasaki-san, URL=`.../2353` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 61/61 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 61/61 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.boys-loves.fr/.../2353.jpg` -> 2 manga URLs (examples: `.../2353`, `.../2353`) |  |  |  |
| thumbnail | PASS | `https://www.boys-loves.fr/.../2353.jpg` (image/jpeg, 85462 bytes, 600x831) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2353` |  |  |  |
| details thumbnail URL | PASS | `https://www.boys-loves.fr/.../2353.jpg` |  |  |  |
| details author | PASS | icco |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Yaoi (Boys' Love), Fantastique, Romance, Comédie |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Hanasaki Akuru, simple fleuriste, est né avec un oeil maudit. Toutes les personnes qui croisent son regard tombent désespérément amoureuses de lui. Depuis tout petit, il tente de cacher son oeil, mais les accidents arrivent parfois, et il doit régulièrement déménager.<br>Un jour, Kirigaya Itsuki lui tombe dessus devant son magasin, et se retrouve maudit à son tour. Hanasaki déménage, mais Kirigaya se trouve être un détective privé, et il semble désormais impossible de se débarrasser de lui...<br><br>Tome 1/1<br><br>Collection: Hana Collection<br>Éditeur VO: Kaiôhsha<br>Parution: 11-11-2026<br>Public: 16 ans et plus<br><br>Le manga Look at me, Hanasaki-san a été prépublié au Japon sous le label &.Emo comics, une collection de l'éditeur Kaiousha (海王社), spécialisée dans les titres Boys' Love. Le premier volume relié est paru le 18 mai 2023 au Japon. À ce jour, l'œuvre est présentée comme un titre en un volume, offrant une histoire complète et captivante. En France, la licence est éditée par Hana Collection, une maison d'édition reconnue pour son catalogue riche en mangas Yaoi, garantissant une traduction soignée et une présentation adaptée au public francophone.<br><br>Auteur(s):<br>icco, la mangaka derrière l'œuvre Look at me, Hanasaki-san (titre original : こっち向いてよ、花咲さん), s'est forgée une réputation solide dans l'univers du Boys' Love grâce à son trait délicat et sa capacité à explorer des dynamiques relationnelles complexes. Bien que les informations détaillées sur son parcours soient parfois discrètes, icco est reconnue pour son approche sensible des récits romantiques entre hommes, souvent empreints d'une touche de fantastique ou de situations originales qui pimentent les interactions de ses personnages. Ses œuvres précédentes, bien que moins médiatisées à l'international, ont su capter l'attention des lecteurs de BL au Japon, la positionnant comme une voix à suivre pour des histoires à la fois tendres et passionnées.<br><br>Adaptations:<br>À l'heure actuelle, Look at me, Hanasaki-san ne bénéficie d'aucune adaptation en anime, film, OAV, drama CD ou jeu vidéo. L'œuvre reste, pour l'instant, une expérience exclusivement manga, permettant aux lecteurs de s'immerger pleinement dans l'univers visuel et narratif créé par icco.<br><br>Réception:<br>Dès sa parution, Look at me, Hanasaki-san a su séduire la communauté Boys' Love au Japon, notamment en étant référencé sur des plateformes spécialisées comme Chil Chil, un indicateur clé de son appréciation au sein du fandom BL. Le concept original de l'œil maudit de Hanasaki Akuru, qui force l'amour chez ceux qu'il croise, a été particulièrement salué pour son potentiel dramatique et comique, offrant une base unique pour une romance pleine de rebondissements. Les lecteurs ont apprécié la manière dont icco tisse une intrigue où la contrainte initiale se mue progressivement en une quête de sentiments authentiques, questionnant la nature même de l'attirance et du désir. La qualité du dessin et l'expressivité des personnages contribuent également à l'engouement, rendant la tension amoureuse palpable et les scènes intimes particulièrement réussies. Bien que n'ayant pas encore reçu de prix majeurs spécifiques au genre BL tels que les Chil Chil BL Awards, sa présence et sa popularité sur les sites dédiés témoignent d'une réception critique favorable et d'un succès certain auprès de son public cible, qui ne cesse de louer l'originalité de son scénario et le charme de ses protagonistes. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.boys-loves.fr/.../bl-img <redacted query values: p and k>` (image/jpeg, 147947 bytes, 830x1170; server Content-Type: image/jpg) |  |  |  |
