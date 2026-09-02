# Extension Validation Report

- Extension: tachiyomi-es.apollcomics-v1.6.57
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3044113561993269522
- Source name: ApollComics
- Source language: es
- Selected manga input: popular offset 0: Dos por una (`.../2080`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Dos por una (`.../2080`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 25 | Switch On (`.../2232`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Las manos sanadoras del doctor (`.../1435`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Encerrada (`.../3426`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 25 | Dos por una (`.../2080`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dos por una (`.../2080`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 50 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 100 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dos por una, URL=`2080` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 125/125 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 125/125 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://apollcomics.es/.../Dos-por-una-175x238.png` (image/png, 21136 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2080` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://apollcomics.es/.../Dos-por-una-193x278.png` (image/png, 26509 bytes, 193x278) |  |  |  |
| details author | PASS | Shinbia |  |  |  |
| details artist | PASS | Coremix |  |  |  |
| details genres | PASS | Drama, Maduro, Manhwa |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | No uno, sino dos Manhwa también conocido como (también conocido como) “No uno, sino dos”. Este webtoon OnGoing se lanzó en 2021. La historia fue escrita por Shinbia y las ilustraciones por Coremix. El webtoon Not One, But Two trata sobre drama, historia madura. Ver comic Dos por una toomics gratis online, solo en apollcomics, esta pagina esta hecha para ver comics como Dos por una toomics y más toomics gratis todo online.<br><br>Acogerlos podría haber sido un error… ¿O es una bendición disfrazada?<br><br>Nombres Alternativos: Not One, But Two |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 50 chapters |  |  |  |
| chapter dates | PASS | 50 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 100 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.apollshort.xyz/.../0.jpg` (image/jpeg, 18318 bytes, 720x500) |  |  |  |
