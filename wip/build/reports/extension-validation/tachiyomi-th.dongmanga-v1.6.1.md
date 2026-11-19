# Extension Validation Report

- Extension: tachiyomi-th.dongmanga-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T22:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 33
- Lint: 0
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 412880068769253150
- Source name: ดองมังงะ
- Source language: th
- Selected manga input: popular offset 0: I Became an Evolving Space Monster ฉันกลายเป็นสัตว์ประหลาดต่างดาวที่เติบโตได้ (`.../118`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 431 | I Became an Evolving Space Monster ฉันกลายเป็นสัตว์ประหลาดต่างดาวที่เติบโตได้ (`.../118`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 431 | Steel-Eating Player เพลเยอร์นักกินเหล็ก (`.../437`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | I Became an Evolving Space Monster ฉันกลายเป็นสัตว์ประหลาดต่างดาวที่เติบโตได้ (`.../118`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | I Became an Evolving Space Monster ฉันกลายเป็นสัตว์ประหลาดต่างดาวที่เติบโตได้ (`.../118`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 65 | ตอนที่ 0 (`.../5199`) |  | <1s |
| pages | `getPageList(chapter)` | success | 107 |  |  | 1-10s |

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
| popular listing | PASS | 431 entries |  |  |  |
| latest listing | PASS | 431 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=I Became an Evolving Space Monster ฉันกลายเป็นสัตว์ประหลาดต่างดาวที่เติบโตได้, URL=`118` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 863/863 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 863/863 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webtoons.dongmanga.com/.../i-became-an-evolving-space-monster.webp` (image/webp (encoding: lossy), 162712 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `118` |  |  |  |
| details thumbnail URL | PASS | `https://webtoons.dongmanga.com/.../i-became-an-evolving-space-monster.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | อ่านมังงะฟรี |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ตัวเอกชอบเล่นเกมที่เลือกเผ่าเป็นเอเลี่ยนได้ อยู่ดีๆก็มาเกิดในโลกเกมที่ชอบเล่น และเกิดเป็นเผ่าที่ชอบที่สุด เผ่าเอมอฟ เหมือนเอเลี่ยนในหนัง ซึ่งเผ่านี้จะสามารถพัฒนาไปได้เรื่อยๆ แต่จะมีช่วงเวลาลำบากแค่ตอนที่เกิดใหม่เป็นตัวอ่อนที่จะบอบบางและตายง่าย อีกทั้งยังมีสกิลที่จะได้รับสกิลพิเศษจากเหยื่อที่กินไปด้วย ทางตัวเอกจะมีการวางแผนรอบคอบ ระมัดระวังไม่ให้ถูกฆ่าตาย แล้วเพราะวิญญานเคยเป็นคนมาก่อน ทำให้มีไหวพริบ สามารถปั่นหัวมนุษย์ที่อยู่บนยานอวกาศได้<br><br>**Alternative Names:**<br>- ฉันกลายเป็นสัตว์ประหลาดต่างดาวที่เติบโตได้<br>- I Became an Evolving Space Monster<br>- Evolution: Road to Space Monster<br>- 進化する宇宙怪物となった<br>- 진화하는 우주괴물이 되었다 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 65 chapters |  |  |  |
| chapter dates | PASS | 65 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 107 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://webtoons.dongmanga.com/.../016535432e9663ca.webp <redacted query values: e and s>` (image/webp (encoding: lossy), 50942 bytes, 760x873) |  |  |  |
