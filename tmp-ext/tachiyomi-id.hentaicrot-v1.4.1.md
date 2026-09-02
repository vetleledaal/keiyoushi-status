# Extension Validation Report

- Extension: tachiyomi-id.hentaicrot-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 29
- Lint: 1
- Warnings: 1
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1764268677652741702
- Source name: Hentai Crot
- Source language: id
- Selected manga input: popular offset 0: Kurui Tsuma ~Komochi Joshidaisei Hitozuma ni Shinobiyoru Kuroi Kyokon~ (`.../kurui-tsuma-komochi-joshidaisei-hitozuma-ni-shinobiyoru-kuroi-kyokon`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 8 | Kurui Tsuma ~Komochi Joshidaisei Hitozuma ni Shinobiyoru Kuroi Kyokon~ (`.../kurui-tsuma-komochi-joshidaisei-hitozuma-ni-shinobiyoru-kuroi-kyokon`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 8 | Advice for the Whipped (Girls forM Vol. 14) | Iinari no Susume (`.../advice-for-the-whipped-girls-form-vol-14-iinari-no-susume-62zu2u76c6`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Kurui Tsuma ~Komochi Joshidaisei Hitozuma ni Shinobiyoru Kuroi Kyokon~ (`.../kurui-tsuma-komochi-joshidaisei-hitozuma-ni-shinobiyoru-kuroi-kyokon`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Kurui Tsuma ~Komochi Joshidaisei Hitozuma ni Shinobiyoru Kuroi Kyokon~ (`.../kurui-tsuma-komochi-joshidaisei-hitozuma-ni-shinobiyoru-kuroi-kyokon`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 1 | Chapter 1 (`.../kurui-tsuma-komochi-joshidaisei-hitozuma-ni-shinobiyoru-kuroi-kyokon`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 36 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 8 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Kurui Tsuma ~Komochi Joshidaisei Hitozuma ni Shinobiyoru Kuroi Kyokon~, URL=`.../kurui-tsuma-komochi-joshidaisei-hitozuma-ni-shinobiyoru-kuroi-kyokon` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 17/17 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 17/17 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaicrot.com/.../Kurui-Tsuma-Komochi-Joshidaisei-Hitozuma-ni-Shinobiyoru-Kuroi-Kyokon-01-200x285.jpg` (image/jpeg, 21061 bytes, 200x285) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kurui-tsuma-komochi-joshidaisei-hitozuma-ni-shinobiyoru-kuroi-kyokon` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaicrot.com/.../Kurui-Tsuma-Komochi-Joshidaisei-Hitozuma-ni-Shinobiyoru-Kuroi-Kyokon-01.jpg` (image/jpeg, 303004 bytes, 1450x2048) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Anal, Berwarna, Blowjob, Booty, Busty, Creampie, Doggy Style, Double Penetration, Full Color, Group, Netorare, Pubic Hair, Toket Besar, Uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Baca komik hentai manga xxx bokep sex porn Kurui Tsuma ~Komochi Joshidaisei Hitozuma ni Shinobiyoru Kuroi Kyokon~. Jumlah halaman : 37 Bahasa : Indonesia Artists : Neginegio |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://img.openhentai.net/.../Crazy-Wife-The-Creeping-Darkness-%20(2).webp` (image/webp (container: extended), 308898 bytes, 1472x2048) |  |  |  |
