# Extension Validation Report

- Extension: tachiyomi-es.celestialmoon-v1.4.34
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7771256386177960897
- Source name: Celestial Moon
- Source language: es
- Selected manga input: latest offset 0: El Escándalo de Moralis (`.../el-escandalo-de-moralis`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 12 | Amor de Prisión (`.../amor-de-prision`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 12 | El Tirano Posesivo y su Gata Dormilona (`.../el-tirano-posesivo-y-su-gata-dormilona`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 12 | El Escándalo de Moralis (`.../el-escandalo-de-moralis`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 12 | He domesticado al príncipe monstruoso (`.../he-domesticado-al-principe-monstruoso`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | El Escándalo de Moralis (`.../el-escandalo-de-moralis`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | El Escándalo de Moralis (`.../el-escandalo-de-moralis`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 74 | Chapter PRÓLOGO (`.../el-escandalo-de-moralis-prologo`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El Escándalo de Moralis, URL=`.../el-escandalo-de-moralis` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://celestialmoonscan.es/.../prtd.jpg` (image/jpeg, 77917 bytes, 480x623) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../el-escandalo-de-moralis` |  |  |  |
| details thumbnail URL | PASS | `https://celestialmoonscan.es/.../prtd.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Fantasía, Romance, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Para vengarse de su esposo, quien le arrebató todo, Lorena eligió la muerte. Sin embargo, en el momento en que regresó milagrosamente al pasado, su determinación cambió. Esta vida será diferente. Para proteger a su familia y arruinar a su esposo… El método: un divorcio lleno de condiciones. “Necesito un perro guardián. Uno que pueda atrapar a las ratas.” Una alianza peligrosa, un trato mortal. Ahora comienza su obra maestra de venganza. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 74 chapters |  |  |  |
| chapter dates | PASS | 74 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://celestialmoonscan.es/.../01_celestialm-15.webp` (image/webp (encoding: lossy), 525636 bytes, 690x9290) |  |  |  |
