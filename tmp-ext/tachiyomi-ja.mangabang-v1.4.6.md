# Extension Validation Report

- Extension: tachiyomi-ja.mangabang-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 34
- Lint: 0
- Warnings: 1
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: comiciviewer
- Source ID: 6323380629311776595
- Source name: MangaBang Comics
- Source language: ja
- Selected manga input: popular offset 0: 役立たず冒険者【メニュー画面】で英雄に！　課金するほどチート機能が手に入るんですが!? (`.../f6e6315fcacf9`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 32 | 役立たず冒険者【メニュー画面】で英雄に！　課金するほどチート機能が手に入るんですが!? (`.../f6e6315fcacf9`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | 異世界クラス召喚されたらＲ1○のスキルを獲得したので、○りたい放題させてもらいます！ (`.../c262a7daf6b6a`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | 斬り開くは剣の道 (`.../894828314ccb2`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 役立たず冒険者【メニュー画面】で英雄に！　課金するほどチート機能が手に入るんですが!? (`.../f6e6315fcacf9`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 役立たず冒険者【メニュー画面】で英雄に！　課金するほどチート機能が手に入るんですが!? (`.../f6e6315fcacf9`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 79 | 第1話 再出発 (`.../4ff4993646c5a`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 54 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=役立たず冒険者【メニュー画面】で英雄に！　課金するほどチート機能が手に入るんですが!?, URL=`.../f6e6315fcacf9` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2026081309260719194C777DEC2E44B7BFE00BBA3B5BF2BC6-sm.webp` (image/webp (encoding: lossy), 16578 bytes, 320x168) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../f6e6315fcacf9` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2026081309260719194C777DEC2E44B7BFE00BBA3B5BF2BC6.png` (image/png, 4336836 bytes, 2560x1344) |  |  |  |
| details author | PASS | 万野みずき, たるたるぐんぐん |  |  |  |
| details artist | PASS | 万野みずき, たるたるぐんぐん |  |  |  |
| details genres | PASS | バトル・アクション, 冒険, ファンタジー, 設定が面白い, チート |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | スキル【メニュー画面】を持つアルモニカは、アイテムの格納しかできない実力不足の荷物持ちだと幼馴染パーティから追放された。しかし、【メニュー画面】にはパーティにも明かしていない隠された機能が沢山あり――。今度こそ信用できる仲間を見つけるためのアルモニカの旅が始まる！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 79 chapters |  |  |  |
| chapter dates | PASS | 79 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 54 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://comicsviewer.manga-bang.com/.../master-1722218209197-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 4, 11, 2, 1, 9, 7, 3, 13, 10, 6, 12, 15, 5, 0, 8\]` (image/jpeg, 292977 bytes, 874x1231) |  |  |  |
