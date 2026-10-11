# Extension Validation Report

- Extension: tachiyomi-fr.hanabook-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
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
- Selected manga input: popular offset 0: Ne me mordez pas mr l'Alpha (`.../2287`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 49 | Ne me mordez pas mr l'Alpha (`.../2287`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Douces leçons d'extase (`.../2362`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Ne me mordez pas mr l'Alpha (`.../2287`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Ne me mordez pas mr l'Alpha (`.../2287`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Ne me mordez pas mr l'Alpha (`.../2287 <redacted query values: n>`) |  | <1s |
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
| popular listing | PASS | 49 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Ne me mordez pas mr l'Alpha, URL=`.../2287` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 62/62 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 62/62 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.boys-loves.fr/.../2287.jpg` -> 2 manga URLs (examples: `.../2287`, `.../2287`) |  |  |  |
| thumbnail | PASS | `https://www.boys-loves.fr/.../2287.jpg` (image/jpeg, 98630 bytes, 600x831) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2287` |  |  |  |
| details thumbnail URL | PASS | `https://www.boys-loves.fr/.../2287.jpg` |  |  |  |
| details author | PASS | Shinonome Noyoco |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Yaoi (Boys' Love), Omegaverse, Romance, Comédie |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Kazuki est un oméga en master d'ingénierie, cumulant les jobs alimentaires pour aider sa mère à subvenir aux besoins financiers de sa famille.<br>Mais à son grand regret, Kazuki a attiré l'attention de M.Takamiya, un alpha issu d'une famille riche, qui le suit jusqu'à son travail et l'a même demandé en mariage.<br>Malgré ses nombreux refus, Kazuki se retrouve quand même charmé par les avances de M.Takamiya et sent la tension sexuelle monter en lui comme jamais auparavant...?<br>Une histoire d'amour fulgurante qui n'a failli jamais voir le jour entre un riche héritier alpha ultra canon et un travailleur acharné oméga issu d'une famille pauvre.<br><br>Tome 1/1<br><br>Collection: Hana Book<br>Éditeur VO: Kaiôhsha<br>Parution: 07-10-2026<br>Public: +18 ans<br><br>En France, le manga Ne me mordez pas mr l'Alpha est édité par Boy's Love Editions, avec une date de parution fixée au 11 septembre 2026. Le premier tome compte 176 pages. Concernant sa prépublication et son éditeur japonais, les informations précises ne sont pas disponibles dans les sources consultées. Cependant, il est courant pour les œuvres de ce genre d'être publiées dans des magazines spécialisés dans le Boys' Love, tels que Canna, édité par Printemps Shuppan, qui est une anthologie reconnue dans l'univers du Yaoi. Le titre s'inscrit pleinement dans la catégorie des mangas LGBT, spécifiquement Yaoi, et explore l'univers populaire de l'Omegaverse.<br><br>Auteur(s):<br>Shinonome Noyoco est une autrice complète, reconnue dans le milieu du Boys' Love pour son talent à la fois au scénario et au dessin. Son œuvre se distingue par une exploration sensible des dynamiques relationnelles masculines, souvent teintée d'une touche de réalisme et d'une intensité émotionnelle palpable. Parmi ses créations notables, on peut citer Jikkyō Kinshi no After Night, où elle a également assuré l'intégralité de la narration et de l'illustration. Son style graphique est apprécié pour sa capacité à capturer les expressions et les émotions de ses personnages, rendant leurs interactions d'autant plus vivantes et engageantes pour le lectorat.<br><br>Adaptations:<br>À ce jour, aucune adaptation en anime, film, OAV, drama CD, jeu vidéo ou spin-off n'a été annoncée pour Ne me mordez pas mr l'Alpha. L'œuvre est encore récente sur le marché francophone, sa sortie étant prévue pour septembre 2026.<br><br>Réception:<br>Étant donné que la sortie française de Ne me mordez pas mr l'Alpha est prévue pour le 11 septembre 2026, il n'existe pas encore de réception critique ou de prix décernés pour cette édition. Les plateformes de vente françaises indiquent actuellement « 0 avis » pour le titre. Néanmoins, l'engouement autour des titres Omegaverse et la réputation de Shinonome Noyoco dans le genre Boys' Love suggèrent un potentiel d'accueil favorable au sein de la communauté. L'œuvre promet d'attirer les lecteurs friands de romances intenses et de dynamiques de pouvoir complexes, caractéristiques du genre. |  |  |  |
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
| page load | PASS | `https://www.boys-loves.fr/.../bl-img <redacted query values: p and k>` (image/jpeg, 209069 bytes, 830x1170; server Content-Type: image/jpg) |  |  |  |
