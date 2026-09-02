# Extension Validation Report

- Extension: tachiyomi-zh.hikarinagi-v1.6.1
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

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3266193817034354049
- Source name: Hikarinagi
- Source language: zh
- Selected manga input: popular offset 0: 链锯人 (`.../228`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | 链锯人 (`.../228`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | 金牌得主 (`.../26`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | 上伊那牡丹，醉姿如百合 (`.../1121`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | 辣妹与辣妹的百合 (`.../3373`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | 链锯人 第二部 (`.../6275`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 链锯人 (`.../228`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 246 | 第01话 (`.../7892`) |  | <1s |
| pages | `getPageList(chapter)` | success | 190 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=链锯人, URL=`228` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 98/98 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 98/98 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imagesp.yurari.moe/.../de7f08fe-8fa6-43fb-b687-d597aaceeb17.webp` (image/webp (container: extended), 834002 bytes, 1297x2048) |  |  |  |
| details identity | PASS | Details preserved selected URL `228` |  |  |  |
| details thumbnail URL | PASS | `https://imagesp.yurari.moe/.../de7f08fe-8fa6-43fb-b687-d597aaceeb17.webp` |  |  |  |
| details author | PASS | 藤本树 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 藤本タツキ, 漫画, 战斗, 邪道, 热血, 周刊少年JUMP, 集英社, 藤本树, 自由人, 2018, 少年JUMP, 日本, 奇幻, 搞笑, 少年, JUMP, 原创, 週刊少年ジャンプ, 神经病, 连载中, 系列, 已完结, 猎奇, 自由, 日漫, 血腥, 漫画系列, 2019, 电锯人, 少年漫画 |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 电次是个背负了父亲遗留下的庞大债务，因此过着极端贫穷生活的少年，他救了恶魔啵奇塔，并与它一起以恶魔猎人的身份斩杀低阶恶魔来换取酬劳。有一天，黑帮骗了电次，让他成为一堆恶魔的祭品，电次在临死之际，啵奇塔牺牲自己，把心脏给了他，让他复活并拥有了恶魔的力量，只要一拉位在心脏那边的链子就能发动。之后电次被公安人员看上，因此成为公安的恶魔猎人…… |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 246 chapters |  |  |  |
| chapter dates | PASS | 246 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 190 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://hikarinagi-mangas.bdbc670a06597b7c8f006b124082955a.r2.cloudflarestorage.com/.../001e2627e52c80882f2c666c6ec650d194e250f7983c1a9b912ad3697da3c234.webp <redacted query values: X-Amz-Algorithm, X-Amz-Content-Sha256, X-Amz-Credential, X-Amz-Date, X-Amz-Expires, X-Amz-Signature, X-Amz-SignedHeaders, x-amz-checksum-mode, and x-id>` (image/webp (encoding: lossy), 216990 bytes, 980x1471) |  |  |  |
