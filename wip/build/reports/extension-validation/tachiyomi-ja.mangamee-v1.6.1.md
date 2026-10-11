# Extension Validation Report

- Extension: tachiyomi-ja.mangamee-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 31
- Lint: 2
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5152016637336953348
- Source name: MangaMee
- Source language: ja
- Selected manga input: popular offset 0: 禁忌の子 (`.../53974`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | 禁忌の子 (`.../53974`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 50 | 押してダメならシてみます？ (`.../54467`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 禁忌の子 (`.../53974`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 禁忌の子 (`.../53974`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 124 | 1 プロローグ (`.../241381`) |  | <1s |
| pages | `getPageList(chapter)` | success | 109 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=禁忌の子, URL=`53974` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 101/101 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 101/101 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://prod-img.manga-mee.jp/.../11351.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 127964 bytes, 1125x666) |  |  |  |
| details identity | PASS | Details preserved selected URL `53974` |  |  |  |
| details thumbnail URL | PASS | `https://prod-img.manga-mee.jp/.../11351.webp <redacted query values: hash and expires>` |  |  |  |
| details author | PASS | 原作：仙崎ひとみ<br>制作：SORAJIMA |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | ダーク, 情熱的, 恋愛.../%E3%82%AA%E3%83%88%E3%83%8A |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 異性を次々と誘惑する【禁忌の子】に覚醒したことで、ソフィアは20年の短い生涯を終える事となった。<br>【禁忌の子】――それは天使と悪魔の混血であり、定期的に天使か悪魔の精を取り入れないと、淫魔に堕ちてしまう運命。<br>奇跡的に時間を逆戻ったソフィアは、未来を変えようと抗うが運命は容赦なくソフィアを「発情」させ、男を「誘惑」させる。<br>救いの手を伸ばすのは、血の繋がらない弟：アレス＆敵の一族：エヴァンという二人の禁断の相手だったーー。<br>彼らの愛は、心が乱されるほど激しくて…淫魔に堕ちたくない禁忌の娘×束縛を企む天使の弟×純情な愛を貫く悪魔が織りなすダークロマンスファンジ――<br><br>Alternative Title: きんきのこ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 124 chapters |  |  |  |
| chapter dates | LINT | All 124 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=124 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 109 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://prod-img.manga-mee.jp/.../18524371.webp <redacted query values: hash and expires>` (image/webp (encoding: lossy), 70886 bytes, 720x1000) |  |  |  |
