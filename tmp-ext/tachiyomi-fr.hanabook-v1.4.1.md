# Extension Validation Report

- Extension: tachiyomi-fr.hanabook-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 28
- Lint: 3
- Warnings: 2
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
- Selected manga input: popular offset 0: Slip (`.../2262`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 48 | Slip (`.../2262`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 8 | Second virgin (`.../2288`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Slip (`.../2262`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Slip (`.../2262`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Slip (`.../2262 <redacted query values: n>`) |  | <1s |
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
| popular listing | PASS | 48 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Slip, URL=`.../2262` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 57/57 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 57/57 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.boys-loves.fr/.../2262.jpg` -> 2 manga URLs (examples: `.../2262`, `.../2262`) |  |  |  |
| thumbnail | PASS | `https://www.boys-loves.fr/.../2262.jpg` (image/jpeg, 58699 bytes, 600x831) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../2262` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.boys-loves.fr/.../cover.jpg` (image/jpeg, 48504 bytes, 460x654) |  |  |  |
| details author | PASS | epaule |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Yaoi (Boys' Love), Classique, Romance, Drame |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Minori, quarante ans et célibataire, est le président d'une entreprise de design. Lors d'un mariage, il croise un ancien ami et camarade de classe d'université, Takuya, dont il est toujours amoureux.<br>À son âge, Minori est plutôt doué pour cacher ses sentiments, mais dès le moment où Takuya le touche, il ne peut pas résister...<br>Une histoire d'amour entre deux hommes riches et sexy qui pensent déjà avoir tout vu de la vie !<br><br>Tome 1/1<br><br>Collection: Hana Book<br>Éditeur VO: Julian Publishing<br>Parution: 28-05-2026<br>Public: +18 ans<br><br>L'œuvre originale, intitulée « スリップ » (Slip), a vu le jour au Japon en 2025. Il s'agit d'un webcomic de type Yaoi, prépublié sous le label « arca comics », une empreinte éditoriale spécialisée dans les récits Boys' Love. L'édition originale est publiée par Julian au Japon, et se compose d'un unique volume, marquant ainsi une histoire complète. En France, les droits ont été acquis par Hana (Hana Book), qui prévoit la publication du premier tome en 2026.<br><br>Auteur(s):<br>epaule est une mangaka japonaise dont le parcours, bien que relativement récent avec des débuts en 2022, s'inscrit déjà dans le paysage du Boys' Love. Reconnue pour son trait délicat et sa capacité à explorer les nuances des relations masculines, elle s'est rapidement distinguée dans le genre Yaoi. Bien que les informations détaillées sur ses œuvres antérieures soient limitées, « Slip » confirme son orientation vers des récits romantiques et intimes.<br><br>Adaptations:<br>À ce jour, « Slip » de epaule n'a fait l'objet d'aucune adaptation en anime, film, OAV, drama CD ou jeu vidéo. Aucun spin-off n'a été annoncé pour cette licence.<br><br>Réception:<br>Bien que « Slip » soit une œuvre relativement récente, elle a déjà su capter l'attention de la communauté Boys' Love. Sur des plateformes dédiées, le manga affiche une note moyenne de 8.47 sur 10, basée sur un nombre significatif de votes, témoignant d'une réception positive et d'un engouement certain de la part des lecteurs. Cette appréciation souligne la qualité de son récit et la justesse de son approche des dynamiques amoureuses masculines, confirmant son potentiel à devenir un titre apprécié au sein du genre Yaoi. |  |  |  |
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
| page load | PASS | `https://www.boys-loves.fr/.../bl-img <redacted query values: p and k>` (image/jpeg, 142785 bytes, 830x1170; server Content-Type: image/jpg) |  |  |  |
