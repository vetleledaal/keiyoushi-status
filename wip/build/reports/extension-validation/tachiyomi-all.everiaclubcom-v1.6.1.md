# Extension Validation Report

- Extension: tachiyomi-all.everiaclubcom-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 3
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8698756602692547891
- Source name: EveriaClub (unoriginal)
- Source language: all
- Selected manga input: popular offset 0: Yuuki Mita 三田悠貴 – GIRLS graph. デジタル写真集 「少しだけ大人になった君と。」 (`.../kk86664bYuuki%20Mita%20%E4%B8%89%E7%94%B0%E6%82%A0%E8%B2%B4%20%E2%80%93%20GIRLS%20graph.%20%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E5%B0%91%E3%81%97%E3%81%A0%E3%81%91%E5%A4%A7%E4%BA%BA%E3%81%AB%E3%81%AA%E3%81%A3%E3%81%9F%E5%90%9B%E3%81%A8%E3%80%82%E3%80%8D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Yuuki Mita 三田悠貴 – GIRLS graph. デジタル写真集 「少しだけ大人になった君と。」 (`.../kk86664bYuuki%20Mita%20%E4%B8%89%E7%94%B0%E6%82%A0%E8%B2%B4%20%E2%80%93%20GIRLS%20graph.%20%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E5%B0%91%E3%81%97%E3%81%A0%E3%81%91%E5%A4%A7%E4%BA%BA%E3%81%AB%E3%81%AA%E3%81%A3%E3%81%9F%E5%90%9B%E3%81%A8%E3%80%82%E3%80%8D`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Misao Oguri 小栗操 – REbecca 写真集 「Misao 蒼春プールサイド」 (`.../kk86739bMisao%20Oguri%20%E5%B0%8F%E6%A0%97%E6%93%8D%20%E2%80%93%20REbecca%20%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8CMisao%20%E8%92%BC%E6%98%A5%E3%83%97%E3%83%BC%E3%83%AB%E3%82%B5%E3%82%A4%E3%83%89%E3%80%8D`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Hana Takeuchi 竹内花 – 週プレ Photo Book 「こんなにも大胆だったなんて」 (`.../kk86689bHana%20Takeuchi%20%E7%AB%B9%E5%86%85%E8%8A%B1%20%E2%80%93%20%E9%80%B1%E3%83%97%E3%83%AC%20Photo%20Book%20%E3%80%8C%E3%81%93%E3%82%93%E3%81%AA%E3%81%AB%E3%82%82%E5%A4%A7%E8%83%86%E3%81%A0%E3%81%A3%E3%81%9F%E3%81%AA%E3%82%93%E3%81%A6%E3%80%8D`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Yuuki Mita 三田悠貴 – GIRLS graph. デジタル写真集 「少しだけ大人になった君と。」 (`.../kk86664bYuuki%20Mita%20%E4%B8%89%E7%94%B0%E6%82%A0%E8%B2%B4%20%E2%80%93%20GIRLS%20graph.%20%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E5%B0%91%E3%81%97%E3%81%A0%E3%81%91%E5%A4%A7%E4%BA%BA%E3%81%AB%E3%81%AA%E3%81%A3%E3%81%9F%E5%90%9B%E3%81%A8%E3%80%82%E3%80%8D`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../kk86664bYuuki%20Mita%20%E4%B8%89%E7%94%B0%E6%82%A0%E8%B2%B4%20%E2%80%93%20GIRLS%20graph.%20%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E5%B0%91%E3%81%97%E3%81%A0%E3%81%91%E5%A4%A7%E4%BA%BA%E3%81%AB%E3%81%AA%E3%81%A3%E3%81%9F%E5%90%9B%E3%81%A8%E3%80%82%E3%80%8D`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | FAIL | Thumbnail URL `https://files.pursue.cc/.../951f32f5b52e45548dcf1ab221b62554.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../kk86664bYuuki Mita 三田悠貴 – GIRLS graph. デジタル写真集 「少しだけ大人になった君と。」` |  |  |  |
| details thumbnail URL | PASS | `https://files.pursue.cc/.../951f32f5b52e45548dcf1ab221b62554.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | GIRLS Graph, Yuuki Mita 三田悠貴 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://files.pursue.cc/.../1d4baa1d3a574494a630e27619f75dcf.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
