# Extension Validation Report

- Extension: tachiyomi-ja.comicogyaaa-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 3754263546482783493
- Source name: Comic Ogyaaa
- Source language: ja
- Selected manga input: popular offset 0: 堕天使お姉さんたちを更生させて天使に戻そうと思います (`.../12207421983882368808`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 81 | 堕天使お姉さんたちを更生させて天使に戻そうと思います (`.../12207421983882368808`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 81 | Visu I (`.../12207421983478011201`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 堕天使お姉さんたちを更生させて天使に戻そうと思います (`.../12207421983882368808`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 堕天使お姉さんたちを更生させて天使に戻そうと思います (`.../12207421983882368808`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 5 | 第1話 (`.../12207421983882589778`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 52 |  |  | 1-10s |

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
| popular listing | PASS | 81 entries |  |  |  |
| latest listing | PASS | 81 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=堕天使お姉さんたちを更生させて天使に戻そうと思います, URL=`12207421983882368808` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 163/163 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 163/163 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-ogyaaa.com/.../12207421983882368808-12e091f9c7ff439547933e0aa88aba3d <redacted query values: 1782209579>` (image/jpeg, 368647 bytes, 600x600) |  |  |  |
| details identity | PASS | Details preserved selected URL `12207421983882368808` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-ogyaaa.com/.../12207421983882368808-12e091f9c7ff439547933e0aa88aba3d <redacted query values: 1782209579>` |  |  |  |
| details author | PASS | 蒼尊 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 天界で「堕天使更生課」に所属している、見習い天使のネロ。彼の目標は、人間界に堕とされた元・四大天使を更生させて天界へと戻すこと。しかし、かつて憧れた元・四大天使たちは、どいつもこいつも見るも無惨な堕落っぷりで…？ ちょっぴりセクシーな堕天使たちの更生記録、開幕！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 52 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-ogyaaa.com/.../12207421983882606728-32a93e7dd1791f6af4e9cd997f187e19` (image/jpeg, 253612 bytes, 844x1200) |  |  |  |
