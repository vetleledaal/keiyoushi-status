# Extension Validation Report

- Extension: tachiyomi-all.xiutaku-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6520733892888572506
- Source name: Xiutaku
- Source language: all
- Selected manga input: latest offset 0: [XiuRen秀人网]第FW0714期Lingyu69写真 (`.../19545`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [XiuRen秀人网]第FW0693期鱼子酱写真 (`.../19524`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | [XiuRen秀人网]第FW0679期谢小蒽写真 (`.../19510`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | [XiuRen秀人网]第FW0714期Lingyu69写真 (`.../19545`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [XiuRen秀人网]第FW0694期袁圆写真 (`.../19525`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [XiuRen秀人网]第FW0714期Lingyu69写真 (`.../19545`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [XiuRen秀人网]第FW0714期Lingyu69写真 (`.../19545`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 3 | Page 1 (`.../19545 <redacted query values: page>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[XiuRen秀人网\]第FW0714期Lingyu69写真, URL=`.../19545` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.xiutaku.com/.../19584.webp` (image/webp (encoding: lossy), 38376 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../19545` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | XiuRen秀人网, Lingyu69 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | \[XiuRen秀人网\]FW0714 秀人番外 Lingyu69 – 浴室情挑 主题写真 \[119P\]。国内写真套图\[XiuRen秀人网\]秀人番外第FW0714期Lingyu69浴室情挑主题写真。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 3 chapters |  |  |  |
| chapter dates | PASS | 3 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i.xiutaku.com/.../96112241183.jpg` (image/webp (encoding: lossy), 121012 bytes, 2400x3598; server Content-Type: image/jpeg) |  |  |  |
