# Extension Validation Report

- Extension: tachiyomi-all.doujiva-v1.6.1
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1868981745168096185
- Source name: Doujiva
- Source language: all
- Selected manga input: popular offset 0: [Akagai (Mine Thrower)] Otokonoko Gal, Kaeriuchi ni Au | Turning The Tables On A Femboy [English] (`.../akagai-mine-thrower-otokonoko-gal-kaeriuchi-ni-au-turning-the-tables-on-a-femboy-english-679579`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | [Akagai (Mine Thrower)] Otokonoko Gal, Kaeriuchi ni Au | Turning The Tables On A Femboy [English] (`.../akagai-mine-thrower-otokonoko-gal-kaeriuchi-ni-au-turning-the-tables-on-a-femboy-english-679579`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | [くるくる] クール系男装女に彼女寝取られたから、わからせてやった2 [中国翻訳] [無修正] (`.../2-679397`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | [Anabuki Bouhatei] Syorai Yuubou na Supotsu Zyousi_ Kinketsu no tame Karata wo Uru MTL (`.../anabuki-bouhatei-syorai-yuubou-na-supotsu-zyousi-kinketsu-no-tame-karata-wo-uru-mtl-679891`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | [2nd color (Typehatena)] Kodomo Idol o Suki Houdai shite Idenshi Mazemaze Haramase Nyanko | 童星小偶像任你随心所欲无限畅玩 对着萝莉小猫咪们爆射浓精灌大孕肚 (THE IDOLM@STER CINDERELLA GIRLS, Gakuen IDOLM@STER) [Chinese] [黒緋鞠汉化] [Decensored] [Digital] (`.../2nd-color-typehatena-kodomo-idol-o-suki-houdai-shite-idenshi-mazemaze-haramase-nyanko-the-idolmster-cinderella-girls-gakuen-idolmster-chinese-decensored-digital-679703`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Akagai (Mine Thrower)] Otokonoko Gal, Kaeriuchi ni Au | Turning The Tables On A Femboy [English] (`.../akagai-mine-thrower-otokonoko-gal-kaeriuchi-ni-au-turning-the-tables-on-a-femboy-english-679579`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../cmtsxw5dz07hw01nxriirpdhr`) |  | <1s |
| pages | `getPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 96/96 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 96/96 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.doujiva.com/.../cover.webp` (image/webp (encoding: lossy), 29932 bytes, 700x989) |  |  |  |
| details identity | PASS | Details preserved selected URL `akagai-mine-thrower-otokonoko-gal-kaeriuchi-ni-au-turning-the-tables-on-a-femboy-english-679579` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.doujiva.com/.../cover.webp` |  |  |  |
| details author | PASS | mine thrower, akagai |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | original, stockings, anal, anal intercourse, fishnets, mesuiki, crossdressing, tomgirl, males only, yaoi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Pages: 32<br>Language: en<br>Type: MANGA<br>Source: nhentai |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.doujiva.com/.../001.webp` (image/webp (encoding: lossy), 194986 bytes, 1280x1808) |  |  |  |
