# Extension Validation Report

- Extension: tachiyomi-es.shadowmanga-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5649269152264667286
- Source name: Shadow Manga
- Source language: es
- Selected manga input: popular offset 0: Tensei Goblin dakedo Shitsumon Aru? (`.../103551`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 242 | Tensei Goblin dakedo Shitsumon Aru? (`.../103551`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Mairimashita! Iruma-kun (`.../52264`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 15 | INAKAMONO NO OSSAN WA MUJIKAKU NI MUSOU SURU ~TA... (`.../103680`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tensei Goblin dakedo Shitsumon Aru? (`.../103551`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tensei Goblin dakedo Shitsumon Aru? (`.../103551`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 95 | Cap. 1 - . (`.../1399931`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 242 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tensei Goblin dakedo Shitsumon Aru?, URL=`103551` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Giant Ojou-Sama, URL=`16484` at page 1 offset 15 and page 2 offset 9 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 274/274 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 274/274 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.shademanga.com/.../portada-1794639457236.webp <redacted query values: v>` (image/webp (encoding: lossy), 130020 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `103551` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.shademanga.com/.../portada-1794639457236.webp <redacted query values: v>` |  |  |  |
| details author | PASS | Nazuna Miki, Tsuranori Araki |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aventura, Acción, Comedia, Drama, Seinen, Isekai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Akira Yagami es un oficinista que pierde la vida al intentar salvar a un niño de ser atropellado. Sin embargo, en lugar de desaparecer para siempre, reencarna en un mundo de fantasía… ¡convertido en un goblin!<br>El problema es que los goblins de ese mundo tienen una esperanza de vida de apenas siete días. Por fortuna, Akira recibe una habilidad especial llamada «Humano: 80 años», que le permite vivir mucho más tiempo que los de su especie.<br>Gracias a esta ventaja, comienza a heredar las habilidades de otros goblins y hasta obtiene poderes extraordinarios relacionados con el Rey Demonio. Con sus conocimientos de su vida anterior y sus nuevas capacidades, Akira busca sobrevivir, proteger a los suyos y convertirse en una figura poderosa en un mundo lleno de amenazas, humanos y criaturas mágicas. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 95 chapters |  |  |  |
| chapter dates | PASS | 95 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.shademanga.com/.../0001.webp <redacted query values: v>` (image/webp (container: extended), 352686 bytes, 1053x1500) |  |  |  |
