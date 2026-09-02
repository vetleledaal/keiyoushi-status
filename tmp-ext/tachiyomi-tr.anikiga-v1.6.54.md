# Extension Validation Report

- Extension: tachiyomi-tr.anikiga-v1.6.54
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8011699941614610362
- Source name: Anikiga
- Source language: tr
- Selected manga input: popular offset 0: My Classmate Tanaka-san Is Super Scary (`.../2099`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 14 | My Classmate Tanaka-san Is Super Scary (`.../2099`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 14 | My Classmate Tanaka-san Is Super Scary (`.../2099`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | My Classmate Tanaka-san Is Super Scary (`.../2099`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | My Classmate Tanaka-san Is Super Scary (`.../2099`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 53 | Bölüm 1 (`.../bolum-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | <1s |

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
| popular listing | PASS | 14 entries |  |  |  |
| latest listing | PASS | 14 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=My Classmate Tanaka-san Is Super Scary, URL=`2099` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 29/29 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 29/29 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://anikiga.com/.../956ac263-372b-4d3b-bd2c-fd45ae2947d3-175x238.jpg` (image/jpeg, 14599 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `2099` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://anikiga.com/.../956ac263-372b-4d3b-bd2c-fd45ae2947d3-193x278.jpg` (image/jpeg, 18089 bytes, 193x278) |  |  |  |
| details author | PASS | Yasushige |  |  |  |
| details artist | PASS | Yasushige |  |  |  |
| details genres | PASS | Komedi, Okul Hayatı, Romantik, Yaşamdan Kesitler, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Sınıf arkadaşım Tanaka-san çok korkutucu… ya da öyle mi?<br><br>Alternative Names: Classmate no Tanaka-san wa Sugoku Kowai ; クラスメイトの田中さんはすごく怖い |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 53 chapters |  |  |  |
| chapter dates | LINT | 20 of 53 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=20 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://anikiga.com/.../ickapak---Kopya.jpg` (image/jpeg, 685021 bytes, 732x1024) |  |  |  |
