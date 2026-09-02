# Extension Validation Report

- Extension: tachiyomi-es.doujinshell-v1.4.53
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 33
- Lint: 1
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7008709488397053596
- Source name: DoujinsHell
- Source language: es
- Selected manga input: latest offset 0: EL EXCITANTE DEBUT DE LA GORDIBUENA HINA-CHAN (`.../el-excitante-debut-de-la-gordibuena-hina-chan`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | ESCUELA EN CASA 1 (`.../escuela-en-casa-1`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | MAMÁ SUCIA X PUTA SUCIA 1 (`.../mama-sucia-x-puta-sucia-1`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 12 | EL EXCITANTE DEBUT DE LA GORDIBUENA HINA-CHAN (`.../el-excitante-debut-de-la-gordibuena-hina-chan`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | UNA HISTORIA SOBRE HACERLE COSAS MALAS A NICHIKA NANAKUSA COMPLETAMENTE EBRIA (`.../una-historia-sobre-hacerle-cosas-malas-a-nichika-nanakusa-completamente-ebria`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | EL EXCITANTE DEBUT DE LA GORDIBUENA HINA-CHAN (`.../el-excitante-debut-de-la-gordibuena-hina-chan`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | EL EXCITANTE DEBUT DE LA GORDIBUENA HINA-CHAN (`.../el-excitante-debut-de-la-gordibuena-hina-chan`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capítulo (`https://doujinshell.net/.../el-excitante-debut-de-la-gordibuena-hina-chan <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=EL EXCITANTE DEBUT DE LA GORDIBUENA HINA-CHAN, URL=`.../el-excitante-debut-de-la-gordibuena-hina-chan` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://doujinshell.net/.../05-2-110x150.jpg` (image/jpeg, 36487 bytes, 110x150) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-excitante-debut-de-la-gordibuena-hina-chan` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://doujinshell.net/.../05-2-193x278.jpg` (image/jpeg, 46554 bytes, 193x278) |  |  |  |
| details author | PASS | Muronaga Chaashuu |  |  |  |
| details artist | PASS | Muronaga Chaashuu |  |  |  |
| details genres | PASS | Ahegao, Big Ass, Comedia, Cosplays, Fetiches, Maduras, Masturbation, Nakadashi, Ninfomanas, Oral, Paizuri, Sumisas, Tetonas, Vanilla |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | <br><br>SOLO DENLE CLICK A LA IMAGEN PARA DESCARGAR EL DOUJIN<br><br>Nombres Alternativos: EL EXCITANTE DEBUT DE LA GORDIBUENA HINA-CHAN - DEKA KAGE GA-RU HINA-CHAN DOKIDOKI DEBYU-SEN #17554 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 1 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img119.imagetwist.com/.../bykdr74j8us9.jpg` (image/jpeg, 191123 bytes, 566x800) |  |  |  |
