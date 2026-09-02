# Extension Validation Report

- Extension: tachiyomi-en.manganel-v1.6.36
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 678343830630527432
- Source name: MangaNel
- Source language: en
- Selected manga input: popular offset 0: Tales of Demons and Gods (`.../tales-of-demons-and-gods`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Release That Witch (`.../release-that-witch`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | A Royal Rebound: Forget My Ex-Fiancé, I'm Being Pampered By The Prince! (`.../a-royal-rebound-forget-my-ex-fianc-i-m-being-pampered-by-the-prince`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | The Player That Can't Level Up (`.../the-player-that-can-t-level-up`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tales of Demons and Gods (`.../tales-of-demons-and-gods`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 975 | Chapter 1 - Rebirth (`.../chapter-1.0`) |  | <1s |
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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tales of Demons and Gods, URL=`.../tales-of-demons-and-gods` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 122/122 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 122/122 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://thumb.mghcdn.com/.../tales-of-demons-and-gods.jpg` -> 2 manga URLs (examples: `.../tales-of-demons-and-gods`, `.../tales-of-demons-and-gods-by-mad-snail`), `https://thumb.mghcdn.com/.../solo-leveling.jpg` -> 2 manga URLs (examples: `.../solo-leveling_102`, `.../solo-leveling-by-sung-lak-jang`), `https://thumb.mghcdn.com/.../rebirth-of-the-urban-immortal-cultivator.jpg` -> 2 manga URLs (examples: `.../rebirth-of-the-urban-immortal-cultivator`, `.../rebirth-of-the-urban-immortal-cultivator-by-daxingdao-anime-shili-jianshen-uncle-zhong`), `https://thumb.mghcdn.com/.../komi-san-wa-komyushou-desu.jpg` -> 2 manga URLs (examples: `.../komi-san-wa-komyushou-desu`, `.../komi-san-wa-komyushou-desu-by-oda-tomohito`), `https://thumb.mghcdn.com/.../boku-no-hero-academia.jpg` -> 2 manga URLs (examples: `.../boku-no-hero-academia-by-horikoshi-kouhei`, `.../boku-no-hero-academia_114`), `https://thumb.mghcdn.com/.../shinka-no-mi.jpg` -> 2 manga URLs (examples: `.../shinka-no-mi-by-miku-sorano`, `.../shinka-no-mi`), `https://thumb.mghcdn.com/.../jungle-juice.jpg` -> 2 manga URLs (examples: `.../jungle-juice`, `.../jungle-juice-by`) |  |  |  |
| thumbnail | PASS | `https://thumb.mghcdn.com/.../tales-of-demons-and-gods.jpg` (image/jpeg, 116383 bytes, 250x371) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../tales-of-demons-and-gods` |  |  |  |
| details thumbnail URL | PASS | `https://thumb.mghcdn.com/.../tales-of-demons-and-gods.jpg` |  |  |  |
| details author | PASS | Mad Snail |  |  |  |
| details artist | PASS | Jiang Ruotai |  |  |  |
| details genres | PASS | Action, Romance, Adventure, Wuxia, Time Travel, Martial Arts, Harem, Web Comic, Full Color, Safe, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In his past life, although too weak to protect his home when it counted, out of grave determination Nie Li became the strongest Demon Spiritist and stood at the pinnacle of the martial world. However, he lost his life during the battle with the Sage Emperor and six deity-ranked beasts.<br>His soul was then brought back to when he was still 13 years old. Although he’s the weakest in his class with the lowest talent, having only a red soul realm and a weak one at that, with the aid of the vast knowledge which he accumulated from his previous life, he decided to train faster than anyone could expect. He also decided to help those who died nobly in his previous life to train faster as well.<br>He aims to protect the city from the coming future of being devastated by demon beasts and the previous fate of ending up destroyed. He aims to protect his lover, friends, family and fellow citizens who died in the beast assault or its aftermath. And he aims to destroy the so-called Sacred family who arrogantly abandoned their duty and betrayed the city in his past life.<br><br>Alternative Names:<br>- 妖神记 (Chinese)<br>- 妖神记（全彩）<br>- Tale of Demons and Gods (English)<br>- Yaoshenji<br>- TDG<br>- Yāo Shén Jì<br>- Yêu Thần Ký (Vietnamese - Tiếng Việt - TV)<br>- Yao Shen Ji<br>- Historier om Demoner og Guder (Bokmål)<br>- حكايا الشياطين والملوك (Arabic) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 975 chapters |  |  |  |
| chapter dates | PASS | 975 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://imgx.mghcdn.com/.../1.jpg` (image/jpeg, 190506 bytes, 728x1029) |  |  |  |
