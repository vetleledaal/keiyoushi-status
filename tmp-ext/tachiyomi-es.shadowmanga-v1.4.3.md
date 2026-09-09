# Extension Validation Report

- Extension: tachiyomi-es.shadowmanga-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5649269152264667286
- Source name: Shadow Manga
- Source language: es
- Selected manga input: latest offset 0: Shinmai Ossan Bouken-sha, Saikyou paati ni shinu hodo kitae rarete Muteki ni naru (`.../102964`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 292 | Morino-san no me deja en paz (`.../103360`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 301 | Shinmai Ossan Bouken-sha, Saikyou paati ni shinu hodo kitae rarete Muteki ni naru (`.../102964`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Shinmai Ossan Bouken-sha, Saikyou paati ni shinu hodo kitae rarete Muteki ni naru (`.../102964`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Shinmai Ossan Bouken-sha, Saikyou paati ni shinu hodo kitae rarete Muteki ni naru (`.../102964`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 59 | Cap. 0 -  (`.../1356593`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 4 |  |  | <1s |

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
| popular listing | PASS | 292 entries |  |  |  |
| latest listing | PASS | 301 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shinmai Ossan Bouken-sha, Saikyou paati ni shinu hodo kitae rarete Muteki ni naru, URL=`102964` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 594/594 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 594/594 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.shademanga.com/.../portada-1782088464851.webp <redacted query values: v>` (image/webp (encoding: lossy), 97330 bytes, 512x728) |  |  |  |
| details identity | PASS | Details preserved selected URL `102964` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.shademanga.com/.../portada-1782088464851.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Kishima Kiraku |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Acción, Aventura, Fantasía, Comedia, Survival, Magia |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Es de conocimiento común que es mejor convertirse en aventurero cuando eres lo más joven posible, porque el poder mágico que es la base de la fuerza de un aventurero difícilmente crecerá si no lo entrenas cuando eres joven. Pero este hombre, Rick Gladiator.... ¡¡¿se convirtió en aventurero cuando tenía más de treinta años y después de trabajar años como un simple recepcionista?!! Rick havivido una vida inimaginable mientras entrenaba con los miembros del legendario Orichalcum Fist, considerados los aventureros mas fuertes de continente, y ahora vuelve a la ciudad para poder ser formalmente un aventurero y cumplir su sueño de la niñez. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name |  |  |  |
| chapters | PASS | 59 chapters |  |  |  |
| chapter dates | PASS | 59 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.shademanga.com/.../0001.webp <redacted query values: v>` (image/jpeg, 360726 bytes, 1414x2000; server Content-Type: image/webp) |  |  |  |
