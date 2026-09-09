# Extension Validation Report

- Extension: tachiyomi-pt.muitohentai-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 33
- Lint: 3
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1062606379654091909
- Source name: Muito Hentai
- Source language: pt-BR
- Selected manga input: latest offset 0: Minha Gentil Senpai é uma Ninfomaníaca (`.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Minha Gentil Senpai é uma Ninfomaníaca (`.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Tudo Culpa da Professora. 2ª Parte - A Professora Futanari Explode de Tesão (`.../zenbu-sensei-no-sei-2-kouhen-futanari-jokyoushi-ga-seiyoku-bakuhatsu-oyako-o-sukkiri-saseru-hanashi-portugues`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 24 | Minha Gentil Senpai é uma Ninfomaníaca (`.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | A Princesa: A Revelação Completa (`.../ojousama-kanzen-haiboku-portugues`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Minha Gentil Senpai é uma Ninfomaníaca (`.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Minha Gentil Senpai é uma Ninfomaníaca (`.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 32 |  |  | 1-10s |

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
| search listing | LINT | Matched selected manga by title at result offset 0: title=Minha Gentil Senpai é uma Ninfomaníaca, URL=`.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://mangaz.muitohentai.club/.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues.jpg` -> 2 manga URLs (examples: `.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues`, `.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues`), `https://mangaz.muitohentai.club/.../kankan-gakugaku-portugues.jpg` -> 2 manga URLs (examples: `.../kankan-gakugaku-portugues`, `.../kankan-gakugaku-portugues`), `https://mangaz.muitohentai.club/.../kazane-no-oshioki-beya-portugues.jpg` -> 2 manga URLs (examples: `.../kazane-no-oshioki-beya-portugues`, `.../kazane-no-oshioki-beya-portugues`), `https://mangaz.muitohentai.club/.../hitozuma-servant-hamidashi-mizugi-av-debut-portugues.jpg` -> 2 manga URLs (examples: `.../hitozuma-servant-hamidashi-mizugi-av-debut-portugues`, `.../hitozuma-servant-hamidashi-mizugi-av-debut-portugues`), `https://mangaz.muitohentai.club/.../hyrule-hanei-no-tame-no-katsudou-portugues.jpg` -> 2 manga URLs (examples: `.../hyrule-hanei-no-tame-no-katsudou-portugues`, `.../hyrule-hanei-no-tame-no-katsudou-portugues`), `https://mangaz.muitohentai.club/.../blue-girl-chan-to-umi-de-asobimashita-portugues.jpg` -> 2 manga URLs (examples: `.../blue-girl-chan-to-umi-de-asobimashita-portugues`, `.../blue-girl-chan-to-umi-de-asobimashita-portugues`), `https://mangaz.muitohentai.club/.../bakunyuudakedo-majimena-jyunsa-buchou-okaasanga-oreno-chinpowo-chitsukokide-nuitekureru-hanashi-portugues.jpg` -> 2 manga URLs (examples: `.../bakunyuudakedo-majimena-jyunsa-buchou-okaasanga-oreno-chinpowo-chitsukokide-nuitekureru-hanashi-portugues`, `.../bakunyuudakedo-majimena-jyunsa-buchou-okaasanga-oreno-chinpowo-chitsukokide-nuitekureru-hanashi-portugues`), `https://mangaz.muitohentai.club/.../ani-love-koushitsudo-chounyuu-imouto-ni-semararete-haramasechau-hanashi-portugues.jpg` -> 2 manga URLs (examples: `.../ani-love-koushitsudo-chounyuu-imouto-ni-semararete-haramasechau-hanashi-portugues`, `.../ani-love-koushitsudo-chounyuu-imouto-ni-semararete-haramasechau-hanashi-portugues`), `https://mangaz.muitohentai.club/.../30sai-doutei-hishojo-no-ecchi-ecchi-daisakusen-portugues.jpg` -> 2 manga URLs (examples: `.../30sai-doutei-hishojo-no-ecchi-ecchi-daisakusen-portugues`, `.../30sai-doutei-hishojo-no-ecchi-ecchi-daisakusen-portugues`), `https://mangaz.muitohentai.club/.../shin-mama-wa-hakoheal-kinmu-en-de-shitteru-papa-ga-kita-portugues.jpg` -> 2 manga URLs (examples: `.../shin-mama-wa-hakoheal-kinmu-en-de-shitteru-papa-ga-kita-portugues`, `.../shin-mama-wa-hakoheal-kinmu-en-de-shitteru-papa-ga-kita-portugues`), `https://mangaz.muitohentai.club/.../suki-darake-no-kimi-wa-portugues.jpg` -> 2 manga URLs (examples: `.../suki-darake-no-kimi-wa-portugues`, `.../suki-darake-no-kimi-wa-portugues`), `https://mangaz.muitohentai.club/.../sono-kisekaeningyo-wa-o-suru-portugues.jpg` -> 2 manga URLs (examples: `.../sono-kisekaeningyo-wa-o-suru-portugues`, `.../sono-kisekaeningyo-wa-o-suru-portugues`), `https://mangaz.muitohentai.club/.../todoita-no-wa-hitozuma-deshita-portugues.jpg` -> 2 manga URLs (examples: `.../todoita-no-wa-hitozuma-deshita-portugues`, `.../todoita-no-wa-hitozuma-deshita-portugues`), `https://mangaz.muitohentai.club/.../takao-san-no-ganmen-kijou-portugues.jpg` -> 2 manga URLs (examples: `.../takao-san-no-ganmen-kijou-portugues`, `.../takao-san-no-ganmen-kijou-portugues`), `https://mangaz.muitohentai.club/.../yawaraka-mai-senpai-portugues.jpg` -> 2 manga URLs (examples: `.../yawaraka-mai-senpai-portugues`, `.../yawaraka-mai-senpai-portugues`), `https://mangaz.muitohentai.club/.../watashi-waruiko-desu-kara-portugues.jpg` -> 2 manga URLs (examples: `.../watashi-waruiko-desu-kara-portugues`, `.../watashi-waruiko-desu-kara-portugues`), `https://mangaz.muitohentai.club/.../wagaya-no-otengu-sama-s-portugues.jpg` -> 2 manga URLs (examples: `.../wagaya-no-otengu-sama-s-portugues`, `.../wagaya-no-otengu-sama-s-portugues`), `https://mangaz.muitohentai.club/.../tsuntsun-shita-patchouli-sama-o-deresasetai-portugues.jpg` -> 2 manga URLs (examples: `.../tsuntsun-shita-patchouli-sama-o-deresasetai-portugues`, `.../tsuntsun-shita-patchouli-sama-o-deresasetai-portugues`), `https://mangaz.muitohentai.club/.../toshishita-kareshi-to-icha-love-sakusen-portugues.jpg` -> 2 manga URLs (examples: `.../toshishita-kareshi-to-icha-love-sakusen-portugues`, `.../toshishita-kareshi-to-icha-love-sakusen-portugues`), `https://mangaz.muitohentai.club/.../tomodachi-no-onna-portugues.jpg` -> 2 manga URLs (examples: `.../tomodachi-no-onna-portugues`, `.../tomodachi-no-onna-portugues`), `https://mangaz.muitohentai.club/.../mujikaku-na-osananajimi-to-kyoumi-honi-de-yatte-mitara-3-portugues.jpg` -> 2 manga URLs (examples: `.../mujikaku-na-osananajimi-to-kyoumi-honi-de-yatte-mitara-3-portugues`, `.../mujikaku-na-osananajimi-to-kyoumi-honi-de-yatte-mitara-3-portugues`), `https://mangaz.muitohentai.club/.../nicutoka-mystia-bon-portugues.jpg` -> 2 manga URLs (examples: `.../nicutoka-mystia-bon-portugues`, `.../nicutoka-mystia-bon-portugues`), `https://mangaz.muitohentai.club/.../nuite-kureru-hokenshitsu-no-sensei-portugues.jpg` -> 2 manga URLs (examples: `.../nuite-kureru-hokenshitsu-no-sensei-portugues`, `.../nuite-kureru-hokenshitsu-no-sensei-portugues`) |  |  |  |
| thumbnail | PASS | `https://mangaz.muitohentai.club/.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues.jpg` (image/webp (encoding: lossy), 164046 bytes, 1280x1807; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues` |  |  |  |
| details thumbnail URL | PASS | `https://mangaz.muitohentai.club/.../kaisha-no-yasashii-senpai-ga-chijo-datta-hanashi-portugues.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Ahegao, Boquete, Creampie, Masturbação, Peitos Grandes |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Sem sinopse por enquanto. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 32 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangaz.muitohentai.club/.../2.jpg <redacted query values: nocache89>` (image/webp (encoding: lossy), 162090 bytes, 1280x1807; server Content-Type: image/jpeg) |  |  |  |
