# Extension Validation Report

- Extension: tachiyomi-ja.magazinepocket-v1.4.12
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 583369548372015159
- Source name: Magazine Pocket
- Source language: ja
- Selected manga input: latest offset 0: 私が予言の子を生むまで ～澪の結婚～　傷モノの花嫁 外伝 (`.../03339`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 25 | ブルーロック (`.../00617`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 25 | 蒼く染めろ (`.../01518`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 31 | 私が予言の子を生むまで ～澪の結婚～　傷モノの花嫁 外伝 (`.../03339`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 45 | 南海トラフ巨大地震 (`.../02584`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 私が予言の子を生むまで ～澪の結婚～　傷モノの花嫁 外伝 (`.../03339`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | 私が予言の子を生むまで ～澪の結婚～　傷モノの花嫁 外伝 (`.../03339`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 16 | 【第1話(1)】予言の子 (`.../442763`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 22 |  |  | 1-10s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 31 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=私が予言の子を生むまで ～澪の結婚～　傷モノの花嫁 外伝, URL=`.../03339` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 127/127 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 127/127 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mgpk-cdn.magazinepocket.com/.../title_grid_wide_20260730110228786e8dee9785549aa10659f1f63571ed.png` (image/png, 72720 bytes, 480x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../03339` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mgpk-cdn.magazinepocket.com/.../banner_2026073011022821cc3eac23b596e2109a27fb54cf900b.png` (image/png, 101247 bytes, 640x368) |  |  |  |
| details author | PASS | 原作.../%E5%8F%8B%E9%BA%BB%E7%A2%A7 漫画.../%E7%94%B0%E4%B8%AD%E6%96%87 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 異世界・異能力 |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 「京極家悲願の英雄を産むのは澪である。よって、澪を娶った者を次期当主とする――」京極家の娘・澪は、幼い頃に受けた虐めで大怪我を負い里を離れていた。五年後、美しく成長した澪が里に戻ると、一族総会にて澪が未来の"英雄"を産むと予言される。その途端、かつて澪を虐めていた本家の若様が澪に結婚を強要し始める。大嫌いな男との婚姻から逃れるために少女が縋ったのは、初恋の人との「愛のない結婚」と「妊娠」で――。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 16 chapters |  |  |  |
| chapter dates | PASS | 16 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 22 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mgpk-cdn.magazinepocket.com/.../8e0b357d439bb4b7cf328fbca67031e5a6e83e44d0f28da32b0bc5c246ae71aa.jpg <redacted query values: Expires, Signature, and Key-Pair-Id>` (image/jpeg, 419010 bytes, 1125x1600) |  |  |  |
