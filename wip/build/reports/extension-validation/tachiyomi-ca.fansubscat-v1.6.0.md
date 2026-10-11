# Extension Validation Report

- Extension: tachiyomi-ca.fansubscat-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: fansubscat
- Source ID: 3974404971892520732
- Source name: Fansubs.cat
- Source language: ca
- Selected manga input: popular offset 0: Final Girl (`.../final-girl`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Final Girl (`.../final-girl`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | Quedes detingut! (`.../quedes-detingut`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | El noi en què estava interessada no era en cap cas un noi (`.../el-noi-en-que-estava-interessada-no-era-en-cap-cas-un-noi`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Tamaki i Amane (`.../tamaki-i-amane`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Final Girl (`.../final-girl`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Final Girl (`.../final-girl`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | One-shot (`.../13637`) |  | <1s |
| pages | `getPageList(chapter)` | success | 41 |  |  | 1-10s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Final Girl, URL=`final-girl` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.fansubs.cat/.../version_3864.jpg` (image/jpeg, 152599 bytes, 421x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `final-girl` |  |  |  |
| details thumbnail URL | PASS | `https://static.fansubs.cat/.../version_3864.jpg` |  |  |  |
| details author | PASS | You Kokikuji |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Acció, Comèdia, Ecchi, Shōnen, Terror |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Als Slashers de terror, la primera en morir sempre és la noia promíscua. Ja sigui enmig del coit o mentre s'estigui dutxant, la pel·li de terror ens mostra el seu cos despullat per després matar-la brutalment d'una manera sanguinolenta i despiadada. Un noi jove del Japó es desperta dins el cos de l'Ariadna, una dels cinc personatges principals de la pel·li "18è Dia del Sacrifici". Desafortunadament, l'Ari és l'exacte tipus de personatge que mor al principi: una noia sexi i experimentada. Malgrat que el món sembla que la vulgui matar, l'Ariadna intentarà sobreviure fins a l'alba i ser l'última noia que sobreviu fins al final. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://fideusalacassola.xyz/.../0.jpg` (image/jpeg, 210546 bytes, 841x1200) |  |  |  |
