# Extension Validation Report

- Extension: tachiyomi-en.hentaidad-v1.6.1
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 4395452767720916400
- Source name: HentaiDad
- Source language: en
- Selected manga input: popular offset 0: Shinobu Kocho - Demon Slayer Kimetsu no Yaiba (`.../shinobu-kocho-demon-slayer-kimetsu-no-yaiba-175507341`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | Shinobu Kocho - Demon Slayer Kimetsu no Yaiba (`.../shinobu-kocho-demon-slayer-kimetsu-no-yaiba-175507341`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | Kyouka Uzen - Chained Soldier FULL 7 Animations - 128 Images (`.../kyouka-uzen-chained-soldier-full-7-animations-128-images-174855698`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Poll Reward Miku Nakano Large Pack - 61 Images (`.../poll-reward-miku-nakano-large-pack-61-images-170130569`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Yennefer and Ciri - The Witcher - Destined Paths (`.../yennefer-and-ciri-the-witcher-destined-paths-164363610`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 12 | Shinobu Kocho - Demon Slayer Kimetsu no Yaiba (`.../shinobu-kocho-demon-slayer-kimetsu-no-yaiba-175507341`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Shinobu Kocho - Demon Slayer Kimetsu no Yaiba (`.../shinobu-kocho-demon-slayer-kimetsu-no-yaiba-175507341`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Gallery (`.../shinobu-kocho-demon-slayer-kimetsu-no-yaiba-175507341`) |  | <1s |
| pages | `getPageList(chapter)` | success | 160 |  |  | <1s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Shinobu Kocho - Demon Slayer Kimetsu no Yaiba, URL=`.../shinobu-kocho-demon-slayer-kimetsu-no-yaiba-175507341` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentaidad.com/.../hu-dieshinobu-shinobu-kochou-175507341-1-thumb.webp` (image/webp (encoding: lossy), 21640 bytes, 400x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../shinobu-kocho-demon-slayer-kimetsu-no-yaiba-175507341` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://hentaidad.com/.../hu-dieshinobu-shinobu-kochou-175507341-1.webp` (image/webp (encoding: lossy), 153398 bytes, 1200x1800) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Shinobu Kocho, Demon Slayer Kimetsu no Yaiba, sAmis, Anime, Manga, Hashira, Demon Slayer Corps, Hentai, Uncensored |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | 160 images<br><br>Shinobu Kocho is a character from Demon Slayer: Kimetsu no Yaiba, the manga and anime series. She is the Insect Hashira of the Demon Slayer Corps, placing her within the series’ Corps and its Hashira. This gallery is centered on Shinobu Kocho and brings together 160 images attributed to sAmis. Its subject connects the character with the wider world of Demon Slayer: Kimetsu no Yaiba, while keeping the collection focused on Shinobu and her place in the series.<br><br>For visitors looking for Shinobu Kocho material, this collection offers a dedicated gallery associated with both the manga and anime franchise. The description identifies her as the Insect Hashira and a member of the Demon Slayer Corps, providing a concise point of reference for her role. The collection’s 160 images are attributed to sAmis, and its title names Shinobu Kocho alongside Demon Slayer: Kimetsu no Yaiba. Together, these details make the gallery relevant to searches for Shinobu, the Hashira, the Corps, and the series. Whether browsing by character or by franchise, visitors can use this page as a focused entry point to a collection devoted to Shinobu Kocho. The gallery keeps its attention on the named character and her connection to Demon Slayer: Kimetsu no Yaiba, without losing the context that she is the Insect Hashira of the Demon Slayer Corps. It is a character-focused collection for fans of the manga and anime series. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 160 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://hentaidad.com/.../hu-dieshinobu-shinobu-kochou-175507341-1.webp` (image/webp (encoding: lossy), 153398 bytes, 1200x1800) |  |  |  |
