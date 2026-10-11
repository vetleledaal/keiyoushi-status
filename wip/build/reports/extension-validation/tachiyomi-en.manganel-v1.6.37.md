# Extension Validation Report

- Extension: tachiyomi-en.manganel-v1.6.37
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 0
- Warnings: 2
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: mangahub
- Source ID: 678343830630527432
- Source name: MangaNel
- Source language: en
- Selected manga input: popular offset 0: Tales of Demons and Gods (`.../tales-of-demons-and-gods`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Release That Witch (`.../release-that-witch`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Isshou Hatarakitakunai Ore Ga Classmate No Daininki Idol Ni Natsukaretara (`.../isshou-hatarakitakunai-ore-ga-classmate-no-daininki-idol-ni-natsukaretara`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | It Rains On Precious Days (`.../it-rains-on-precious-days`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 30 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 985 | Chapter 1 - Rebirth (`.../chapter-1.0`) |  | <1s |
| pages | `getPageList(chapter)` | error | 0 |  | keiyoushi.b.c: Chapter encryption unavailable | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | keiyoushi.b.c: Chapter encryption unavailable | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tales of Demons and Gods, URL=`.../tales-of-demons-and-gods` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=It Rains On Precious Days, URL=`.../it-rains-on-precious-days` at page 1 offset 29 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://thumb.mghcdn.com/.../tales-of-demons-and-gods.jpg` -> 2 manga URLs (examples: `.../tales-of-demons-and-gods`, `.../tales-of-demons-and-gods-by-mad-snail`), `https://thumb.mghcdn.com/.../solo-leveling.jpg` -> 2 manga URLs (examples: `.../solo-leveling_102`, `.../solo-leveling-by-sung-lak-jang`), `https://thumb.mghcdn.com/.../rebirth-of-the-urban-immortal-cultivator.jpg` -> 2 manga URLs (examples: `.../rebirth-of-the-urban-immortal-cultivator`, `.../rebirth-of-the-urban-immortal-cultivator-by-daxingdao-anime-shili-jianshen-uncle-zhong`), `https://thumb.mghcdn.com/.../komi-san-wa-komyushou-desu.jpg` -> 2 manga URLs (examples: `.../komi-san-wa-komyushou-desu`, `.../komi-san-wa-komyushou-desu-by-oda-tomohito`), `https://thumb.mghcdn.com/.../boku-no-hero-academia.jpg` -> 2 manga URLs (examples: `.../boku-no-hero-academia-by-horikoshi-kouhei`, `.../boku-no-hero-academia_114`), `https://thumb.mghcdn.com/.../you-shou-yan.jpg` -> 2 manga URLs (examples: `.../you-shou-yan`, `.../you-shou-yan-by`), `https://thumb.mghcdn.com/.../arcana-16-fairy-tales-nursery-tales.jpg` -> 2 manga URLs (examples: `.../arcana-16-fairy-tales-nursery-tales`, `.../arcana-16-fairy-tales-nursery-tales-by-shinobu-takayama-nanae-mitsu-mutsumi-akazaki-tooru-kaede-ayumi-kano-shiki-kayase-chika-ogaki-yuzu-mizutani-erika-kari-mikami-ritsuhiro-anthology-yashirou-saeki-mame-serikawa-verno-mikawa`) |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../tales-of-demons-and-gods.jpg` (image/jpeg, 116383 bytes, 250x371) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tales-of-demons-and-gods` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../tales-of-demons-and-gods.jpg` |  |  |  |
| details author | PASS | Mad Snail |  |  |  |
| details artist | PASS | Jiang Ruotai |  |  |  |
| details genres | PASS | Action, Romance, Adventure, Wuxia, Time Travel, Martial Arts, Harem, Web Comic, Full Color, Safe, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In his past life, although too weak to protect his home when it counted, out of grave determination Nie Li became the strongest Demon Spiritist and stood at the pinnacle of the martial world. However, he lost his life during the battle with the Sage Emperor and six deity-ranked beasts.<br>His soul was then brought back to when he was still 13 years old. Although he’s the weakest in his class with the lowest talent, having only a red soul realm and a weak one at that, with the aid of the vast knowledge which he accumulated from his previous life, he decided to train faster than anyone could expect. He also decided to help those who died nobly in his previous life to train faster as well.<br>He aims to protect the city from the coming future of being devastated by demon beasts and the previous fate of ending up destroyed. He aims to protect his lover, friends, family and fellow citizens who died in the beast assault or its aftermath. And he aims to destroy the so-called Sacred family who arrogantly abandoned their duty and betrayed the city in his past life.<br><br>Alternative Names:<br>- 妖神记 (Chinese)<br>- 妖神记（全彩）<br>- Tale of Demons and Gods (English)<br>- Yaoshenji<br>- TDG<br>- Yāo Shén Jì<br>- Yêu Thần Ký (Vietnamese - Tiếng Việt - TV)<br>- Yao Shen Ji<br>- Historier om Demoner og Guder (Bokmål)<br>- حكايا الشياطين والملوك (Arabic) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 985 chapters |  |  |  |
| chapter dates | PASS | 985 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | Chapter encryption unavailable |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
