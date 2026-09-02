# Extension Validation Report

- Extension: tachiyomi-ca.fansubscat-v1.4.6
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
- Source ID: 3974404971892520732
- Source name: Fansubs.cat
- Source language: ca
- Selected manga input: popular offset 0: El noi en què estava interessada no era en cap cas un noi (`.../el-noi-en-que-estava-interessada-no-era-en-cap-cas-un-noi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | El noi en què estava interessada no era en cap cas un noi (`.../el-noi-en-que-estava-interessada-no-era-en-cap-cas-un-noi`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | La serp i l'ofrena (`.../la-serp-i-l-ofrena`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Quedes detingut! (`.../quedes-detingut`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | T'he trobat!! (`.../t-he-trobat`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | El noi en què estava interessada no era en cap cas un noi (`.../el-noi-en-que-estava-interessada-no-era-en-cap-cas-un-noi`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | El noi en què estava interessada no era en cap cas un noi (`.../el-noi-en-que-estava-interessada-no-era-en-cap-cas-un-noi`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 167 | Volum 1 - Capítol 1: Ritme A (`.../16687`) |  | <1s |
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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=El noi en què estava interessada no era en cap cas un noi, URL=`el-noi-en-que-estava-interessada-no-era-en-cap-cas-un-noi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://static.fansubs.cat/.../version_4239.jpg` (image/jpeg, 132409 bytes, 301x426) |  |  |  |
| details identity | PASS | Details preserved selected URL `el-noi-en-que-estava-interessada-no-era-en-cap-cas-un-noi` |  |  |  |
| details thumbnail URL | PASS | `https://static.fansubs.cat/.../version_4239.jpg` |  |  |  |
| details author | PASS | Sumiko Arai |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Amor, Amor entre noies, Música |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | L'Aya, una estudiant que va a la moda, perd el cap pel treballador d'una botiga de discos. Té un aire de misteri, un gran estil i un gust musical impecable. Tot i això, ella no sap que aquest treballador és de fet una companya de classe, la Mitsuki! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 167 chapters |  |  |  |
| chapter dates | PASS | 167 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://fideusalacassola.xyz/.../001.jpg` (image/jpeg, 1850502 bytes, 1443x2048) |  |  |  |
