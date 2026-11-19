# Extension Validation Report

- Extension: tachiyomi-all.mangaball-v1.6.7
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.P
- Source ID: 1448906013733277368
- Source name: Manga Ball
- Source language: en
- Selected manga input: popular offset 0: Tears on a Withered Flower (`.../tears-on-a-withered-flower`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | I Became a Patron of Villains (`.../i-became-a-patron-of-villains`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Totsunagi Kaoru Kimi no Kou (`.../totsunagi-kaoru-kimi-no-kou`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 24 | My neighbor is always watching me [UNCENSORED] (`.../my-neighbor-is-always-watching-me-uncensored`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tears on a Withered Flower (`.../tears-on-a-withered-flower`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 362 | Chapter 1 (`.../68713985a57ea95009af1b15`) |  | <1s |
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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tears on a Withered Flower, URL=`tears-on-a-withered-flower` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=Seijo ni Uso wa Tsuujinai, URL=`seijo-ni-uso-wa-tsuujinai` at page 1 offset 20 and page 2 offset 1 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1752065825262.webp` (image/webp (encoding: lossy), 48096 bytes, 960x1246) |  |  |  |
| details identity | PASS | Details preserved selected URL `tears-on-a-withered-flower` |  |  |  |
| details thumbnail URL | PASS | `https://bulbasaur.poke-black-and-white.net/.../cover_1752065825262.webp` |  |  |  |
| details author | PASS | Gae (개), Gae (개), MHL |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Psychological, Long Strip, Romance, Mafia, Office Workers, Sexual Violence, Drama, Slice of Life, Full Color, Adult |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Na Hae-soo's life unravels when her husband betrays her with an affair, leaving her burdened with debt and losing their child. In a devastating blow, she witnesses him with a younger woman. Broken and despondent, Na Hae-soo feels her life crumbling around her. However, a mysterious young man unexpectedly enters her life, asking to be taught about adult love. His vulnerability and sincerity begin to stir emotions within Na Hae-soo, challenging her to reconsider her path forward.<br><br>Alternative Names: <br>- 시든 꽃에 눈물을<br>- Łzy ze zwiędłych kwiatów<br>- Lágrimas Sobre Flores Murchas<br>- 枯萎的花淚<br>- บุปผารุ่มราคะ<br>- Pleure pour cette fleur<br>- Solmuş Bir Çiçeğin Gözyaşları<br>- 枯れた花に涙を<br>- Nước Mắt Trên Đóa Hoa Tàn<br>- NƯỚC MẮT TRÊN ĐÓA HOA TÀN<br>- \[18+\] NƯỚC MẮT TRÊN ĐÓA HOA TÀN<br>- Tears on a Withered Flower<br>- Слёзы на увядшем цветке<br>- Sideun Kkoch-e Nunmul-eul 시든 꽃에 눈물을<br>- Слёзы на увядших цветах<br>- Tears on a Withered Flower - ENGLISH VER 「Pandy」<br>- tears on a withered flower |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 362 chapters |  |  |  |
| chapter dates | PASS | 362 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://bulbasaur.poke-black-and-white.net/.../001.jpg` (image/jpeg, 374362 bytes, 720x12571) |  |  |  |
