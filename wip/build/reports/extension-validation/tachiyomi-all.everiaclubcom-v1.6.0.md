# Extension Validation Report

- Extension: tachiyomi-all.everiaclubcom-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
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
- Selected manga input: popular offset 0: Aika Sawaguchi 沢口愛華 – FRIDAYデジタル写真集 「愛、咲き誇る」 (`.../kk86078bAika%20Sawaguchi%20%E6%B2%A2%E5%8F%A3%E6%84%9B%E8%8F%AF%20%E2%80%93%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E6%84%9B%E3%80%81%E5%92%B2%E3%81%8D%E8%AA%87%E3%82%8B%E3%80%8D`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Aika Sawaguchi 沢口愛華 – FRIDAYデジタル写真集 「愛、咲き誇る」 (`.../kk86078bAika%20Sawaguchi%20%E6%B2%A2%E5%8F%A3%E6%84%9B%E8%8F%AF%20%E2%80%93%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E6%84%9B%E3%80%81%E5%92%B2%E3%81%8D%E8%AA%87%E3%82%8B%E3%80%8D`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | Garum – PhotoBook 「Milk Cow In The Pink House」 (`.../kk86181bGarum%20%E2%80%93%20PhotoBook%20%E3%80%8CMilk%20Cow%20In%20The%20Pink%20House%E3%80%8D`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Suzura すずら – FRIDAYデジタル写真集 雪肌カノジョ Vol.2 大ボリューム完全版 (`.../kk86131bSuzura%20%E3%81%99%E3%81%9A%E3%82%89%20%E2%80%93%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E9%9B%AA%E8%82%8C%E3%82%AB%E3%83%8E%E3%82%B8%E3%83%A7%20Vol.2%20%E5%A4%A7%E3%83%9C%E3%83%AA%E3%83%A5%E3%83%BC%E3%83%A0%E5%AE%8C%E5%85%A8%E7%89%88`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Aika Sawaguchi 沢口愛華 – FRIDAYデジタル写真集 「愛、咲き誇る」 (`.../kk86078bAika%20Sawaguchi%20%E6%B2%A2%E5%8F%A3%E6%84%9B%E8%8F%AF%20%E2%80%93%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E6%84%9B%E3%80%81%E5%92%B2%E3%81%8D%E8%AA%87%E3%82%8B%E3%80%8D`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../kk86078bAika%20Sawaguchi%20%E6%B2%A2%E5%8F%A3%E6%84%9B%E8%8F%AF%20%E2%80%93%20FRIDAY%E3%83%87%E3%82%B8%E3%82%BF%E3%83%AB%E5%86%99%E7%9C%9F%E9%9B%86%20%E3%80%8C%E6%84%9B%E3%80%81%E5%92%B2%E3%81%8D%E8%AA%87%E3%82%8B%E3%80%8D`) |  | <1s |
| pages | `getPageList(chapter)` | success | 16 |  |  | <1s |

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
| thumbnail | FAIL | Thumbnail URL `https://files.pursue.cc/.../879c3ef6d5fa47a382bcdede20803692.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| details identity | PASS | Details preserved selected URL `.../kk86078bAika Sawaguchi 沢口愛華 – FRIDAYデジタル写真集 「愛、咲き誇る」` |  |  |  |
| details thumbnail URL | PASS | `https://files.pursue.cc/.../879c3ef6d5fa47a382bcdede20803692.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Aika Sawaguchi 沢口愛華, ＦＲＩＤＡＹデジタル写真集 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | null |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 16 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | FAIL | First page URL `https://files.pursue.cc/.../8ce9b97ccc9d4eeca6a7c80856d3e200.jpg` could not be downloaded: eu.kanade.tachiyomi.network.HttpException: HTTP error 403 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
