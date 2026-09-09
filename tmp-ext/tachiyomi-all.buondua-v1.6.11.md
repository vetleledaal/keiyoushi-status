# Extension Validation Report

- Extension: tachiyomi-all.buondua-v1.6.11
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1435103006121310663
- Source name: Buon Dua
- Source language: all
- Selected manga input: latest offset 0: X-Level Yeha (예하): Kidnapping (110 photos) (`.../x-level-yeha-yeha-kidnapping-110-photos-6cb9830222278e52091a82b7929c532a-56416`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [Herovia] Choi Somi (최솜이): Some Cat (91 photos) (`.../herovia-choi-somi-choesom-i-some-cat-91-photos-4880856df8b05b066b55b55a3ca6812a-56376`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 20 | [AI Enhanced] [MAXIM] Son Ye-Eun (손예은): Secret Garden (60 photos) (`.../ai-enhanced-maxim-son-ye-eun-son-yeeun-secret-garden-60-photos-90096e50520e0e69363854109958901e-56410`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | X-Level Yeha (예하): Kidnapping (110 photos) (`.../x-level-yeha-yeha-kidnapping-110-photos-6cb9830222278e52091a82b7929c532a-56416`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [内购无水印] Chen Xiaohua (陈小花): 性感和服 (80 photos) (`.../nei-gou-wu-shui-yin-chen-xiaohua-chen-xiao-hua-xing-gan-he-fu-80-photos-141290bf85e8828275ca2c4fe4c48bb9-56403`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | X-Level Yeha (예하): Kidnapping (110 photos) (`.../x-level-yeha-yeha-kidnapping-110-photos-6cb9830222278e52091a82b7929c532a-56416`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | X-Level Yeha (예하): Kidnapping (110 photos) (`.../x-level-yeha-yeha-kidnapping-110-photos-6cb9830222278e52091a82b7929c532a-56416`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 6 | Page 1 (`.../x-level-yeha-yeha-kidnapping-110-photos-6cb9830222278e52091a82b7929c532a-56416 <redacted query values: page>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=X-Level Yeha (예하): Kidnapping (110 photos), URL=`.../x-level-yeha-yeha-kidnapping-110-photos-6cb9830222278e52091a82b7929c532a-56416` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i2.buondua.com/.../X-Level-Yeha-Your-Majesty-Kidnapping-MissKON.com-104.jpeg <redacted query values: d9459d58869a2cdc885ebf162db17966>` (image/jpeg, 87656 bytes, 1024x1536) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../x-level-yeha-yeha-kidnapping-110-photos-6cb9830222278e52091a82b7929c532a-56416` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | X-Level, Yeha |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | \[👉 Download link: MediaFire\](https://ouo.io/.../g2jBCD)<br>\[👉 Download link: Terabox\](https://ouo.io/.../06uG50)<br><br><redacted credential header: password> |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://i2.buondua.com/.../X-Level-Yeha-Your-Majesty-Kidnapping-MissKON.com-001.jpeg <redacted query values: d9459d58869a2cdc885ebf162db17966>` (image/jpeg, 200357 bytes, 2304x1536) |  |  |  |
