# Extension Validation Report

- Extension: tachiyomi-all.webcomics-v1.6.14
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
- Source implementation: keiyoushi.source.a
- Source ID: 5830834696627804450
- Source name: Webcomics
- Source language: en
- Selected manga input: popular offset 0: God-Tier Assassin: I Am the Shadow (`.../6a5757bd62661d6f1572cd55`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | God-Tier Assassin: I Am the Shadow (`.../6a5757bd62661d6f1572cd55`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 18 | The Awakening Contract (`.../677ccdce62661d22c66b7a15`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 18 | Get In My Bed, Supporting Male Leads! (`.../6afbb8d762661d41f1621862`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 18 | The Fake Socialite (`.../6a57589862661d6f1572cd5b`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 20 | God-Tier Assassin: I Am the Shadow (`.../6a5757bd62661d6f1572cd55`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | God-Tier Assassin: I Am the Shadow (`.../6a5757bd62661d6f1572cd55`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 94 | Ch. 1 (`.../cf25891a6346e957a3e06747`) |  | <1s |
| pages | `getPageList(chapter)` | success | 180 |  |  | <1s |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 18 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=God-Tier Assassin: I Am the Shadow, URL=`6a5757bd62661d6f1572cd55` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 92/92 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 92/92 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://imgg.mangaina.com/.../a0646d16cd922c03620680fcf51b6e04.webp` (image/webp (encoding: lossy), 39348 bytes, 540x720; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `6a5757bd62661d6f1572cd55` |  |  |  |
| details thumbnail URL | PASS | `https://imgg.mangaina.com/.../a0646d16cd922c03620680fcf51b6e04.webp` |  |  |  |
| details author | PASS | Munchu |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Fantasy |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | The mysterious game God’s Forsaken has descended upon Earth. In this world, players can gain lifespan by slaying monsters—and even better, they can expend that lifespan to manifest their in-game powers into reality! As supernatural abilities awaken, global chaos and disasters follow in their wake.<br>In his previous life, Qin Feng fought tooth and nail to protect his sister, Qin Xiaoyou, eventually rising to become one of the top 100 powerhouses in the world. However, his devotion was met with the ultimate betrayal. Blinded by her obsession with a celebrity idol, his own sister gouged out his eyes to steal his "Ancient God’s Eyeballs" as a gift for her star.<br>Now, reborn and sent back to the very beginning, Qin Feng has returned. This time, he will trust no one. Embracing the darkness, he chooses to walk the path of a god-tier assassin to become the strongest—alone! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 94 chapters |  |  |  |
| chapter dates | PASS | 94 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 180 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://imgg.mangaina.com/.../SFp1THZ3VFl3N0hFek0rVHpqcVJkdz09_b97cea524ff4fd200ed8fc6c69768f89_cpImg.webp` (image/webp (encoding: lossy), 75618 bytes, 1050x875; server Content-Type: image/png) |  |  |  |
