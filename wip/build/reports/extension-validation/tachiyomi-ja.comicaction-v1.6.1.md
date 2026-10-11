# Extension Validation Report

- Extension: tachiyomi-ja.comicaction-v1.6.1
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
- Source ID: 3399001455113605946
- Source name: Comic Action
- Source language: ja
- Selected manga input: popular offset 0: 冒険には、武器が必要だ！～こだわりルディの鍛冶屋ぐらし～ (`.../10044607041232542427`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 240 | 冒険には、武器が必要だ！～こだわりルディの鍛冶屋ぐらし～ (`.../10044607041232542427`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 240 | 精神科訪問ナースになりました (`.../12207421984213073558`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 冒険には、武器が必要だ！～こだわりルディの鍛冶屋ぐらし～ (`.../10044607041232542427`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 冒険には、武器が必要だ！～こだわりルディの鍛冶屋ぐらし～ (`.../10044607041232542427`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 58 | 第1話 迷宮前町 鯨の喉元『組鍵屋』のルディ (`.../10044607041234328611`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 46 |  |  | 1-10s |

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
| popular listing | PASS | 240 entries |  |  |  |
| latest listing | PASS | 240 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=冒険には、武器が必要だ！～こだわりルディの鍛冶屋ぐらし～, URL=`10044607041232542427` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 481/481 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 481/481 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-action.com/.../10044607041232542427-f2f6d8a1f46bbae90d1d17d1106bd4ac <redacted query values: 1751887801>` (image/jpeg, 564607 bytes, 844x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `10044607041232542427` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-action.com/.../10044607041232542427-f2f6d8a1f46bbae90d1d17d1106bd4ac <redacted query values: 1751887801>` |  |  |  |
| details author | PASS | 窓口基 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 迷宮前町の金物屋で働く見習いの少女・ルディは親方に怒られながらも奇想天外な武器を作って、世界一の鍛冶職人を目指して奮闘中。<br>迷宮の外側の街で冒険を支える普通の人々の日常を描くクラフト・ファンタジー！<br>公式略称は「ぼけぶき」！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 58 chapters |  |  |  |
| chapter dates | PASS | 58 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 46 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-action.com/.../11341664176554428719-43596de6711898508051312d2b49b7d3` (image/jpeg, 505840 bytes, 836x1200) |  |  |  |
