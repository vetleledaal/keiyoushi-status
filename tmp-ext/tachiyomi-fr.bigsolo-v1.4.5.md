# Extension Validation Report

- Extension: tachiyomi-fr.bigsolo-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4410528266393104437
- Source name: BigSolo
- Source language: fr
- Selected manga input: popular offset 0: Mushoku Tensei : Nouvelle vie, nouvelle chance (`.../mushoku-tensei-nouvelle-vie-nouvelle-chance`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 5 | Mushoku Tensei : Nouvelle vie, nouvelle chance (`.../mushoku-tensei-nouvelle-vie-nouvelle-chance`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 104 | Drama Queen (`.../drama-queen`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 4 | Mushoku Tensei : Nouvelle vie, nouvelle chance (`.../mushoku-tensei-nouvelle-vie-nouvelle-chance`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mushoku Tensei : Nouvelle vie, nouvelle chance (`.../mushoku-tensei-nouvelle-vie-nouvelle-chance`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 35 | Vol. 19 Ch. 87 – Nostalgie et agitation (`.../87`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | <1s |

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
| popular listing | PASS | 5 entries |  |  |  |
| latest listing | PASS | 104 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mushoku Tensei : Nouvelle vie, nouvelle chance, URL=`.../mushoku-tensei-nouvelle-vie-nouvelle-chance` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 113/113 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 113/113 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.imgchest.com/.../1c923dcea26c.jpeg` (image/jpeg, 803921 bytes, 1801x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mushoku-tensei-nouvelle-vie-nouvelle-chance` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.imgchest.com/.../1c923dcea26c.jpeg` |  |  |  |
| details author | PASS | Rifujin na Magonote |  |  |  |
| details artist | PASS | Yuka Fujikawa  |  |  |  |
| details genres | PASS | Action, Aventure, Comédie, Drame, Fantaisie, Réincarnation, Isekai, Magie, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | L'histoire nous entraine dans le quotidien d'un NEET qui vient d'être chassé de chez ses parents. Ayant le moral au plus bas, il pense au suicide. Jusqu'au jour où il aperçoit une ancienne camarade de classe sur le point de se faire renverser, et d'un geste héroïque, il l'a pousse et se fait renverser à sa place. Suite à ça, il meurt sur le coup puis se retrouve réincarné dans un monde fantastique.<br><br>Il se réincarne dans le corps d'un enfant du nom de Rudeus Greyrat. Il est le fils d'un épéiste nommé Paul Greyrat et d'une ancienne aventurière nommée Zenith Greyrat.<br><br>Bien décidé à faire quelque chose de sa nouvelle vie en tant que Rudeus, il va essayer de devenir le plus grand magicien de l'histoire. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: artist |  |  |  |
| chapters | PASS | 35 chapters |  |  |  |
| chapter dates | PASS | 35 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.imgchest.com/.../7a07192df2f2.webp` (image/webp (encoding: lossy), 162180 bytes, 1115x1600) |  |  |  |
