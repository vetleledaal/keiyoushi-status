# Extension Validation Report

- Extension: tachiyomi-all.xiutaku-v1.4.4
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
- Source ID: 6520733892888572506
- Source name: Xiutaku
- Source language: all
- Selected manga input: popular offset 0: [XiuRen秀人网]第FW0510期潘娇娇写真 (`.../19341`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | [XiuRen秀人网]第FW0510期潘娇娇写真 (`.../19341`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | [XiuRen秀人网]第FW0494期熊小诺写真 (`.../19325`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 20 | [XiuRen秀人网]第FW0510期潘娇娇写真 (`.../19341`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | [XiuRen秀人网]第FW0490期王馨瑶写真 (`.../19321`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | [XiuRen秀人网]第FW0510期潘娇娇写真 (`.../19341`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | [XiuRen秀人网]第FW0510期潘娇娇写真 (`.../19341`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 5 | Page 1 (`.../19341 <redacted query values: page>`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[XiuRen秀人网\]第FW0510期潘娇娇写真, URL=`.../19341` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i.xiutaku.com/.../19380.webp` (image/webp (encoding: lossy), 33734 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../19341` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | XiuRen秀人网, 潘娇娇 |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | \[XiuRen秀人网\]FW0510 秀人番外 潘娇娇 – 《浴室》 主题写真 \[82P\]。国内写真套图\[XiuRen秀人网\]秀人番外第FW0510期潘娇娇浴室主题写真。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 5 chapters |  |  |  |
| chapter dates | PASS | 5 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://i.xiutaku.com/.../74103831700.jpg` (image/webp (encoding: lossy), 136004 bytes, 2400x3600; server Content-Type: image/jpeg) |  |  |  |
