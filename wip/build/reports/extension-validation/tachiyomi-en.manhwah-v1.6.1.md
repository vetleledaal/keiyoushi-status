# Extension Validation Report

- Extension: tachiyomi-en.manhwah-v1.6.1
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
- Source ID: 3556998591219610081
- Source name: ManhwaH
- Source language: en
- Selected manga input: popular offset 0: Tears on a Withered Flower (`.../685155e6702284f834178607`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tears on a Withered Flower (`.../685155e6702284f834178607`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | [A] The Teachers' Efforts (`.../68af07174477aa4d997e961d`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | When Cinderella's Magic Fades Away (`.../6895489aa6ddb2123c384fd2`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | One-Way Brainwork (`.../6a64229ec321d6032e3899f5`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tears on a Withered Flower (`.../685155e6702284f834178607`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tears on a Withered Flower (`.../685155e6702284f834178607`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 138 | Chapter 1 (`.../68d1b34b8efa5e2349761772`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tears on a Withered Flower, URL=`685155e6702284f834178607` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1752065825262.webp` (image/webp (encoding: lossy), 48096 bytes, 960x1246) |  |  |  |
| details identity | PASS | Details preserved selected URL `685155e6702284f834178607` |  |  |  |
| details thumbnail URL | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1752065825262.webp` |  |  |  |
| details author | PASS | Gae (개), MHL |  |  |  |
| details artist | PASS | Gae (개), MHL |  |  |  |
| details genres | PASS | Manhwa, Sexual Violence, Romance, Drama, Slice of Life, Office Workers, Full Color, Psychological, Long Strip, Mafia, Adult |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 9.1 (63)<br>2024<br><br>Na Hae-soo's life unravels when her husband betrays her with an affair, leaving her burdened with debt and losing their child. In a devastating blow, she witnesses him with a younger woman. Broken and despondent, Na Hae-soo feels her life crumbling around her. However, a mysterious young man unexpectedly enters her life, asking to be taught about adult love. His vulnerability and sincerity begin to stir emotions within Na Hae-soo, challenging her to reconsider her path forward.<br><br>**Alternative Names:**<br>- 시든 꽃에 눈물을<br>- Łzy ze zwiędłych kwiatów<br>- Lágrimas Sobre Flores Murchas<br>- 枯萎的花淚<br>- บุปผารุ่มราคะ<br>- Pleure pour cette fleur<br>- Solmuş Bir Çiçeğin Gözyaşları<br>- 枯れた花に涙を<br>- Nước Mắt Trên Đóa Hoa Tàn<br>- \\[18+\\] NƯỚC MẮT TRÊN ĐÓA HOA TÀN<br>- Слёзы на увядшем цветке<br>- Sideun Kkoch-e Nunmul-eul 시든 꽃에 눈물을<br>- Слёзы на увядших цветах<br>- Tears on a Withered Flower - ENGLISH VER 「Pandy」 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 138 chapters |  |  |  |
| chapter dates | PASS | 138 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bulbasaur.poke-black-and-white.net/.../68d1b34b8efa5e2349761772-001.webp` (image/webp (encoding: lossy), 324480 bytes, 720x12571) |  |  |  |
