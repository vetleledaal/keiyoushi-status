# Extension Validation Report

- Extension: tachiyomi-ja.youngchampion-v1.6.1
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
- Source ID: 162182610453532778
- Source name: Young Champion
- Source language: ja
- Selected manga input: popular offset 0: 秘密法人デスメイカー (`.../f7532548ee427`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 32 | 秘密法人デスメイカー (`.../f7532548ee427`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 落日のパトス (`.../8929b840bb59e`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 終末、なに食べる？ (`.../f34fde75cd65d`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 秘密法人デスメイカー (`.../f7532548ee427`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 秘密法人デスメイカー (`.../f7532548ee427`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 46 | 第1話 (`.../9bff5dc38db98`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=秘密法人デスメイカー, URL=`f7532548ee427` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-public.comici.jp/.../2024112915281755040BD7876381F68292B06780516F9ED97-lg.webp` (image/webp (encoding: lossy), 44488 bytes, 720x378; server Content-Type: application/octet-stream) |  |  |  |
| details identity | PASS | Details preserved selected URL `f7532548ee427` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://cdn-public.comici.jp/.../2024112915281755040BD7876381F68292B06780516F9ED97.png` (image/png, 3045827 bytes, 2560x1344) |  |  |  |
| details author | PASS | 鰻田まあち |  |  |  |
| details artist | PASS | 鰻田まあち |  |  |  |
| details genres | PASS | エロ・お色気, コメディ, サイコ, 少年・青年誌, 日常, ヤンチャンWebオリジナル, 動物・ペット, 特撮 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | SNSでバズってしまった話題作、とうとう連載化！人間のヒーロー作品が大好きで、そんな存在にぶっ殺されることに憧れるデュアルホーン。夢を叶えるべく人間界にやってきたがヒーローはおらず、自分で創ることにしたらヤバい怪人が次々生まれて…！？死と興奮に詳しい鬼才・鰻田まあちが贈る、濁り切った世界観。悪の組織ブラックコメディ！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 46 chapters |  |  |  |
| chapter dates | PASS | 46 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://viewer.youngchampion.jp/.../master-1732861887436-01.jpg <redacted query values: Expires, Signature, and Key-Pair-Id> 4, 6, 3, 12, 2, 11, 15, 10, 1, 8, 14, 13, 0, 9, 5\]` (image/jpeg, 664999 bytes, 1440x2048) |  |  |  |
