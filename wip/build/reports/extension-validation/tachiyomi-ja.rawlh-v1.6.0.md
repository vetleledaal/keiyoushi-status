# Extension Validation Report

- Extension: tachiyomi-ja.rawlh-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: fmreader
- Source ID: 7595224096258102519
- Source name: WeLoveManga
- Source language: ja
- Selected manga input: popular offset 0: Parallel Paradise - Raw (`.../0x4Hj`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Parallel Paradise - Raw (`.../0x4Hj`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | One Punch Man (manga) (`.../0ctK9`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | Q Lab (`.../0PHek`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | Ryuujin No Musume (`.../0Ofbq`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Parallel Paradise - Raw (`.../0x4Hj`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Parallel Paradise - Raw (`.../0x4Hj`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 342 | 1 (`.../0JPlZ`) |  | <1s |
| pages | `getPageList(chapter)` | success | 40 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Parallel Paradise - Raw, URL=`.../0x4Hj` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://s4.ihlv1.xyz/.../272_5f28ef605783c.jpg <redacted query values: imgmax>` (image/jpeg, 496252 bytes, 1127x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../0x4Hj` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://s4.ihlv1.xyz/.../272_5f28ef605783c.jpg` (image/jpeg, 496252 bytes, 1127x1600) |  |  |  |
| details author | PASS | OKAMOTO Lynn |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adult, Comedy, Drama, Fantasy, Gender Bender, Harem, Seinen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Youta The Sun Tada is an ordinary high schooler who dies and finds himself in a fantasy world where he is the only male. Can Youta survive in a world where women have no resistance to him?<br><br>Alternative Name: Parareru Paradaisu, パラレルパラダイス, 平行天堂, 패러렐 파라다이스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 342 chapters |  |  |  |
| chapter dates | PASS | 342 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 40 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://weloma.net/.../manga-list.html <redacted query values: listType, page, sort, and sort_type>` to `https://weloma.net/.../qxjLQ` (1 redirects); popular: `https://weloma.net/.../manga-list.html <redacted query values: listType, page, sort, and sort_type>` to `https://weloma.net/.../qcFhA` (1 redirects); popular: `https://weloma.net/.../manga-list.html <redacted query values: listType, page, sort, and sort_type>` to `https://weloma.net/.../qxjiZ` (1 redirects); popular: `https://weloma.net/.../manga-list.html <redacted query values: , name, page, author, group, m_status, sort, genre, and ungenre>` to `https://weloma.net/.../wUjsJ` (1 redirects); popular: `https://weloma.net/.../manga-list.html <redacted query values: listType, page, sort, and sort_type>` to `https://weloma.net/.../qcZPV` (1 redirects) |  |  |  |
| page load | PASS | `https://s2.ihlv1.xyz/.../df13f409a9b6040b562aad384ef011deimg004.jpg` (image/jpeg, 159984 bytes, 759x1080) |  |  |  |
