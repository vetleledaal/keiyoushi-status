# Extension Validation Report

- Extension: tachiyomi-ja.mangalt-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 1153097454471755439
- Source name: Mangalt
- Source language: ja
- Selected manga input: popular offset 0: 江戸の不倫は死の香り (`.../aa3af9c623b5e`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 江戸の不倫は死の香り (`.../aa3af9c623b5e`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 本田鹿の子の本棚 (`.../72d4e9bbae66c`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 夏のモノクローム (`.../b3efd77b35e37`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 江戸の不倫は死の香り (`.../aa3af9c623b5e`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 江戸の不倫は死の香り (`.../aa3af9c623b5e`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 70 | 第１話　お熊 ［1］ (`.../23d6615dac6e2`) |  | <1s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 32 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=江戸の不倫は死の香り, URL=`aa3af9c623b5e` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../20260220163852695ECEA0E6C617F82C9193E1CD0E2D87B40-lg.webp` (image/webp (container: extended), 47170 bytes, 720x378) |  |  |  |
| details identity | PASS | Details preserved selected URL `aa3af9c623b5e` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../20260220163852695ECEA0E6C617F82C9193E1CD0E2D87B40.png` (image/png, 4029649 bytes, 2560x1344) |  |  |  |
| details author | PASS | 山口譲司 |  |  |  |
| details artist | PASS | 山口譲司 |  |  |  |
| details genres | PASS | 青年マンガ, ヒューマンドラマ, 歴史, お色気, 江戸時代(武士･時代劇) |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 江戸時代、夫婦以外の男女の性交渉はすべて密通だった。<br>婚前性交渉も不倫も心中も僧侶の女遊びもすべて性犯罪だった。<br>しかし過酷な罰則にも関わらず江戸の男女は大胆に性を謳歌していて───<br>不倫に走った江戸の男女の顛末を艶やかに描く。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 70 chapters |  |  |  |
| chapter dates | PASS | 70 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.mangalt.jp/.../master-1768551321853-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 0, 9, 11, 6, 8, 5, 7, 1, 13, 4, 10, 3, 15, 14, 12\]` (image/jpeg, 666057 bytes, 1440x2048) |  |  |  |
