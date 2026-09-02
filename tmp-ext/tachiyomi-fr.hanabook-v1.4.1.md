# Extension Validation Report

- Extension: tachiyomi-fr.hanabook-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 3
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4125236041054867131
- Source name: Hana Book
- Source language: fr
- Selected manga input: popular offset 0: Cherry Bullet Adolescence (`.../2279`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 45 | Cherry Bullet Adolescence (`.../2279`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 7 | L'amour brûlant de mon boss (`.../2361`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Cherry Bullet Adolescence (`.../2279`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Cherry Bullet Adolescence (`.../2279`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Cherry Bullet Adolescence (`.../2279 <redacted query values: n>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | <1s |

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
| latest listing | PASS | 7 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Cherry Bullet Adolescence, URL=`.../2279` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 53/53 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 53/53 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.boys-loves.fr/.../2279.jpg` -> 2 manga URLs (examples: `.../2279`, `.../2279`) |  |  |  |
| thumbnail | PASS | `https://www.boys-loves.fr/.../2279.jpg` (image/jpeg, 124076 bytes, 600x831) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2279` |  |  |  |
| details thumbnail URL | PASS | `https://www.boys-loves.fr/.../2279.jpg` |  |  |  |
| details author | PASS | Natsuwo |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Yaoi (Boys' Love), Classique, Romance, School life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Asahi Unosawa, camarade de Azusa Ôtani, est un garçon plein d'innocence au visage d'ange et particulièrement attachant. Comme le prédisait son nom, c'est justement sa personnalité rayonnante et son visage éclatant qui ont envoûté Azusa, amour réciproque qui les entraîne rapidement à se mettre en couple.
<br>Dans la fleur de leur adolescence, bien sûr que nos amoureux s'enlacent et s'embrassent à foison, mais l'expression virile sur le visage de Asahi lors de leur première nuit d'amour reste gravée dans la mémoire de Azusa... Voulant revoir cette facette de Asahi, Azusa essaie différents stratagèmes pour remettre Asahi en conditions, menant sa raison à rude épreuve.
<br>Voici les débuts tant attendus de la mangaka Natsuwo, dans une romance adolescente pure, à l'aube des premiers ébats.<br><br>Tome 1/1<br><br>Collection: Hana Book<br>Éditeur VO: Julian Publishing<br>Parution: 26-08-2026<br>Public: 16 ans et plus<br><br>Le manga Cherry Bullet Adolescence, connu au Japon sous le titre Shishunki Cherry Bullet, est publié en France par les éditions Boy's Love, sous la collection Hana Book. Le premier tome est prévu pour une sortie le 11 septembre 2026 sur le marché francophone.<br><br>Concernant sa publication originale au Japon, les recherches indiquent qu'il s'agit d'une œuvre de Natsuwo, mais les détails précis concernant le magazine de prépublication spécialisé Yaoi et l'éditeur japonais n'ont pas été explicitement trouvés dans les sources consultées. Il est courant pour les titres BL d'être prépubliés dans des magazines dédiés avant d'être compilés en volumes reliés.<br><br>Le nombre de tomes pour la série n'est pas clairement établi comme une série longue, le premier tome étant présenté comme les débuts de la mangaka, ce qui suggère qu'il pourrait s'agir d'un one-shot ou d'une série courte.<br><br>Auteur(s):<br>Natsuwo est une mangaka dont l'œuvre Cherry Bullet Adolescence marque des débuts très attendus dans le paysage du Boys' Love. Son style se distingue par une approche délicate et une exploration des premiers émois amoureux, comme en témoigne cette romance adolescente. Bien que les informations détaillées sur son parcours et ses œuvres antérieures soient encore en cours de diffusion pour le public francophone, Cherry Bullet Adolescence est présenté comme une œuvre inaugurale prometteuse, posant les bases d'une carrière axée sur les récits sentimentaux masculins.<br><br>Adaptations:<br>À ce jour, aucune adaptation en anime, film, OAV, jeu vidéo ou spin-off n'a été annoncée pour le manga Cherry Bullet Adolescence. Le format Drama CD est une adaptation courante pour les œuvres Boys' Love au Japon, permettant de donner vie aux personnages et aux scènes par le biais de la voix et de la musique. Cependant, aucune information spécifique n'indique l'existence d'un Drama CD pour cette œuvre en particulier.<br><br>Réception:<br>Étant donné la date de parution très récente ou à venir du manga Cherry Bullet Adolescence en France (septembre 2026), et l'absence d'informations détaillées sur sa réception au Japon dans les résultats de recherche actuels, il est difficile de fournir un bilan exhaustif des prix reçus, des critiques spécifiques ou des chiffres de ventes Oricon pour cette œuvre en particulier. Les prix tels que les Chil Chil BL Awards sont des indicateurs majeurs de la popularité et de la reconnaissance dans la communauté Boys' Love au Japon, mais aucune mention de Cherry Bullet Adolescence parmi les lauréats n'a été trouvée. Néanmoins, la publication par un éditeur spécialisé dans le Boys' Love en France, Boy's Love, témoigne d'un potentiel d'attrait pour le public francophone amateur du genre. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.boys-loves.fr/.../bl-img <redacted query values: p and k>` (image/jpeg, 184100 bytes, 830x1170; server Content-Type: image/jpg) |  |  |  |
