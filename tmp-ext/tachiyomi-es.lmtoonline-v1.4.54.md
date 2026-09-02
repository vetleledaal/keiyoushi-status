# Extension Validation Report

- Extension: tachiyomi-es.lmtoonline-v1.4.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7732736838916328250
- Source name: Lmtos
- Source language: es
- Selected manga input: popular offset 0: ORE TO SEIJO GA DEKITERU KOTO (`.../ore-to-seijo-ga-dekiteru-koto`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | ORE TO SEIJO GA DEKITERU KOTO (`.../ore-to-seijo-ga-dekiteru-koto`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Enamorándome de Azami Yako (`.../enamorandome-de-azami-yako`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | El primer amor de Momose Akira es un fracaso. (`.../el-primer-amor-de-momose-akira-es-un-fracaso`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | ORE TO SEIJO GA DEKITERU KOTO (`.../ore-to-seijo-ga-dekiteru-koto`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | ORE TO SEIJO GA DEKITERU KOTO (`.../ore-to-seijo-ga-dekiteru-koto`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Cap. 1 (`.../capitulo-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 50 |  |  | 1-10s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=ORE TO SEIJO GA DEKITERU KOTO, URL=`ore-to-seijo-ga-dekiteru-koto` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 59/59 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 59/59 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.lmtos.net/.../cover-1-mtishj1i-49a128c2.webp` (image/webp (encoding: lossy), 66840 bytes, 500x718) |  |  |  |
| details identity | PASS | Details preserved selected URL `ore-to-seijo-ga-dekiteru-koto` |  |  |  |
| details thumbnail URL | PASS | `https://img.lmtos.net/.../cover-1-mtishj1i-49a128c2.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manga, Romance, Acción, Ecchi, Drama, Aventuras, Isekai |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Bajo, pusilánime y prácticamente inútil: Lin, un mago sombrío e introvertido, siempre ha sido el miembro menos destacado del grupo. Sin embargo, contra todo pronóstico, termina iniciando una relación secreta con Sophia, la deslumbrante y adorada compañera del equipo. Solo hay un problema: nadie puede enterarse bajo ningún concepto. «No podemos dejar que lo sepan... ¡pero aun así quiero hacerlo!». Mientras ambos se ven a escondidas a espaldas de sus compañeros aventureros, la tensión aumenta... y el deseo también. Cada encuentro es una apuesta arriesgada y cada momento de peligro inminente, una descarga de adrenalina. ¡Una comedia romántica algo picante y trepidante ambientada en un mundo de fantasía lleno de peligros, secretos y amor prohibido!<br><br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 50 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.lmtos.net/.../001-mtitgdwr-bd7e33b8.webp` (image/webp (encoding: lossy), 885968 bytes, 2480x3508) |  |  |  |
