# Extension Validation Report

- Extension: tachiyomi-en.webtoonclub-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 5827665338810887442
- Source name: WebtoonClub
- Source language: en
- Selected manga input: latest offset 0: Game Invasion: Awaken Dual Talents at the Start! (`.../game-invasion-awaken-dual-talents-at-the-start`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | A Pervert Who Only Picks and Devours Other Perverts (`.../a-pervert-who-only-picks-and-devours-other-perverts`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Lookism (Bookmanga) (`.../lookism-bookmanga`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Game Invasion: Awaken Dual Talents at the Start! (`.../game-invasion-awaken-dual-talents-at-the-start`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | My Plan to Save NaZha (`.../my-plan-to-save-nazha`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Game Invasion: Awaken Dual Talents at the Start! (`.../game-invasion-awaken-dual-talents-at-the-start`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Game Invasion: Awaken Dual Talents at the Start! (`.../game-invasion-awaken-dual-talents-at-the-start`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 12 | Chapter 0 (`.../0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Game Invasion: Awaken Dual Talents at the Start!, URL=`game-invasion-awaken-dual-talents-at-the-start` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 100/100 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 100/100 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://webtoonclub.com/.../game-invasion-awaken-dual-talents-at-the-start.webp` (image/webp (encoding: lossy), 61492 bytes, 600x900) |  |  |  |
| details identity | PASS | Details preserved selected URL `game-invasion-awaken-dual-talents-at-the-start` |  |  |  |
| details thumbnail URL | PASS | `https://webtoonclub.com/.../game-invasion-awaken-dual-talents-at-the-start.webp` |  |  |  |
| details author | PASS | Mumu (木木) |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua, Webtoons, Action, Drama, Fantasy, Full Color, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | About a century ago, “Divine Tribulation” invaded reality, unleashing countless demons, monsters, and magical beasts. Humanity was forced into a survival system of “Awakening → Class Advancement → Killing Monsters and Leveling Up.” Death has no universal resurrection system. Only a very small number of healing-class specialists possess the limited ability to keep people alive on the battlefield. The calamity also progresses alongside the release of “expansions.” The preview for the third expansion announces that, ten years later, \[Demon God Revival\] will arrive. The strongest warriors are ranked by the number of times they have advanced their classes, while the highest-level guardians are known as “Celestial Venerables.” Yet humanity as a whole still suffers from a severe shortage of high-level experts.<br><br>**Alt titles:** 游戏入侵：开局觉醒双天赋！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 12 chapters |  |  |  |
| chapter dates | PASS | 12 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://webtoonclub.com/.../001.webp` (image/webp (encoding: lossy), 355722 bytes, 1000x667) |  |  |  |
