# Extension Validation Report

- Extension: tachiyomi-es.ikuhentai-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7567013997438852760
- Source name: Ikuhentai
- Source language: es
- Selected manga input: popular offset 0: Ikura de Yaremasu ka? (`.../ikura-de-yaremasu-ka`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Ikura de Yaremasu ka? (`.../ikura-de-yaremasu-ka`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Korekara Onii-chan ni 〇〇〇 Shichaimasu (`.../korekara-onii-chan-ni-%E3%80%87%E3%80%87%E3%80%87-shichaimasu`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Otonari no Darashina Onee san ni Nagusamerareru Hanashi (`.../otonari-no-darashina-onee-san-ni-nagusamerareru-hanashi`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Mamá Sumisa (`.../mama-sumisa`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Ikura de Yaremasu ka? (`.../ikura-de-yaremasu-ka`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Ikura de Yaremasu ka? (`.../ikura-de-yaremasu-ka`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Leer Ikura de Yaremasu ka? (`.../leer-ikura-de-yaremasu-ka <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 39 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Ikura de Yaremasu ka?, URL=`.../ikura-de-yaremasu-ka` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://ikuhentai.net/.../02_69888958_p1-193x278.jpg` (image/jpeg, 10294 bytes, 193x278) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../ikura-de-yaremasu-ka` |  |  |  |
| details thumbnail URL | PASS | `https://ikuhentai.net/.../02_69888958_p1-193x278.jpg` |  |  |  |
| details author | LINT | Author is empty; use null when unknown |  |  |  |
| details artist | PASS | Kemuri Haku |  |  |  |
| details genres | PASS | Colegialas, Full Color, Straight Shota |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Ikura de Yaremasu ka? Una linda colegiala es encontrada por un pequeño niño que le ofrece una suma de dinero para tener sexo con ella, al inicio se niega pero al ver que es bastante dinero finalmente acepta la petición. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 39 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://ikuhentai.net/.../01_69888958_p0.jpg` (image/jpeg, 455680 bytes, 1920x1080) |  |  |  |
