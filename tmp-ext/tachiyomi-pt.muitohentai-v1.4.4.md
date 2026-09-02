# Extension Validation Report

- Extension: tachiyomi-pt.muitohentai-v1.4.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 32
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
- Selected manga input: latest offset 0: O Comandante faz Elegg Cuidar de seu Pênis (Goddess of Victory: Nikke) (`.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | O Comandante faz Elegg Cuidar de seu Pênis (Goddess of Victory: Nikke) (`.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | O Livro em que Eu Fodo a Judi Nee Até o Fim (Tales Of Vesperia) (`.../judi-nee-o-tsuranukitoosu-hon-portugues`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 24 | O Comandante faz Elegg Cuidar de seu Pênis (Goddess of Victory: Nikke) (`.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | A Imperatriz Pirata em Floração Desenfreada (One Piece) (`.../midarezaki-kaizoku-jotei-portugues`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | O Comandante faz Elegg Cuidar de seu Pênis (Goddess of Victory: Nikke) (`.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | O Comandante faz Elegg Cuidar de seu Pênis (Goddess of Victory: Nikke) (`.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 1 | Capitulo 1 (`.../capitulo-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 23 |  |  | 1-10s |

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
| search listing | LINT | Matched selected manga by title at result offset 0: title=O Comandante faz Elegg Cuidar de seu Pênis (Goddess of Victory: Nikke), URL=`.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://mangaz.muitohentai.club/.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues.jpg` -> 2 manga URLs (examples: `.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues`, `.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues`), `https://mangaz.muitohentai.club/.../class-de-ouji-to-yobareteru-kanojo-portugues.jpg` -> 2 manga URLs (examples: `.../class-de-ouji-to-yobareteru-kanojo-portugues`, `.../class-de-ouji-to-yobareteru-kanojo-portugues`), `https://mangaz.muitohentai.club/.../dekiai-kanojo-ni-chinpo-made-amayakasarete-dame-ni-nariso-portugues.jpg` -> 2 manga URLs (examples: `.../dekiai-kanojo-ni-chinpo-made-amayakasarete-dame-ni-nariso-portugues`, `.../dekiai-kanojo-ni-chinpo-made-amayakasarete-dame-ni-nariso-portugues`), `https://mangaz.muitohentai.club/.../yawaraka-ofuton-ammin-guide-portugues.jpg` -> 2 manga URLs (examples: `.../yawaraka-ofuton-ammin-guide-portugues`, `.../yawaraka-ofuton-ammin-guide-portugues`), `https://mangaz.muitohentai.club/.../dabo-portugues-2.jpg` -> 2 manga URLs (examples: `.../dabo-portugues-2`, `.../dabo-portugues-2`), `https://mangaz.muitohentai.club/.../desejos-da-terra-natal-portugues.jpg` -> 2 manga URLs (examples: `.../desejos-da-terra-natal-portugues`, `.../desejos-da-terra-natal-portugues`), `https://mangaz.muitohentai.club/.../elf-tsuki-no-mahou-portugues.jpg` -> 2 manga URLs (examples: `.../elf-tsuki-no-mahou-portugues`, `.../elf-tsuki-no-mahou-portugues`), `https://mangaz.muitohentai.club/.../fate-gaping-order-portugues.jpg` -> 2 manga URLs (examples: `.../fate-gaping-order-portugues`, `.../fate-gaping-order-portugues`), `https://mangaz.muitohentai.club/.../nemuno-san-wa-ikimakuritai-portugues.jpg` -> 2 manga URLs (examples: `.../nemuno-san-wa-ikimakuritai-portugues`, `.../nemuno-san-wa-ikimakuritai-portugues`), `https://mangaz.muitohentai.club/.../nekomimi-onee-san-wa-fuuzokujou-portugues.jpg` -> 2 manga URLs (examples: `.../nekomimi-onee-san-wa-fuuzokujou-portugues`, `.../nekomimi-onee-san-wa-fuuzokujou-portugues`), `https://mangaz.muitohentai.club/.../musashi-chan-no-erohon-portugues.jpg` -> 2 manga URLs (examples: `.../musashi-chan-no-erohon-portugues`, `.../musashi-chan-no-erohon-portugues`), `https://mangaz.muitohentai.club/.../queria-mamae.jpg` -> 2 manga URLs (examples: `.../queria-mamae`, `.../queria-mamae`), `https://mangaz.muitohentai.club/.../estou-planejando-algo-gahara-san-bakemonogatari.jpg` -> 2 manga URLs (examples: `.../estou-planejando-algo-gahara-san-bakemonogatari`, `.../estou-planejando-algo-gahara-san-bakemonogatari`), `https://mangaz.muitohentai.club/.../mulher-casada-registro-de-traicao-da-eriko.jpg` -> 2 manga URLs (examples: `.../mulher-casada-registro-de-traicao-da-eriko`, `.../mulher-casada-registro-de-traicao-da-eriko`), `https://mangaz.muitohentai.club/.../futuros-imigrantes-s-pokemon-sword-and-shield.jpg` -> 2 manga URLs (examples: `.../futuros-imigrantes-s-pokemon-sword-and-shield`, `.../futuros-imigrantes-s-pokemon-sword-and-shield`), `https://mangaz.muitohentai.club/.../mukiryoku-mukuchikei-jk-hibiya-san-ukkari-sensei-no-kakitare-ni-nacchaimashita-portugues.jpg` -> 2 manga URLs (examples: `.../mukiryoku-mukuchikei-jk-hibiya-san-ukkari-sensei-no-kakitare-ni-nacchaimashita-portugues`, `.../mukiryoku-mukuchikei-jk-hibiya-san-ukkari-sensei-no-kakitare-ni-nacchaimashita-portugues`), `https://mangaz.muitohentai.club/.../mukiryoku-mukuchikei-jk-hibiya-san-ukkari-sensei-no-kakitare-ni-nacchaimashita-2-portugues.jpg` -> 2 manga URLs (examples: `.../mukiryoku-mukuchikei-jk-hibiya-san-ukkari-sensei-no-kakitare-ni-nacchaimashita-2-portugues`, `.../mukiryoku-mukuchikei-jk-hibiya-san-ukkari-sensei-no-kakitare-ni-nacchaimashita-2-portugues`), `https://mangaz.muitohentai.club/.../misaki-fight-portugues.jpg` -> 2 manga URLs (examples: `.../misaki-fight-portugues`, `.../misaki-fight-portugues`), `https://mangaz.muitohentai.club/.../minori-mama-de-baburitai-portugues.jpg` -> 2 manga URLs (examples: `.../minori-mama-de-baburitai-portugues`, `.../minori-mama-de-baburitai-portugues`), `https://mangaz.muitohentai.club/.../milk-enikki-ichi-portugues.jpg` -> 2 manga URLs (examples: `.../milk-enikki-ichi-portugues`, `.../milk-enikki-ichi-portugues`), `https://mangaz.muitohentai.club/.../mikoontto-tamamo-no-mae-no-kisei-jijitsu-daisakusen-portugues.jpg` -> 2 manga URLs (examples: `.../mikoontto-tamamo-no-mae-no-kisei-jijitsu-daisakusen-portugues`, `.../mikoontto-tamamo-no-mae-no-kisei-jijitsu-daisakusen-portugues`), `https://mangaz.muitohentai.club/.../konna-watashi-ni-nacchatta-portugues.jpg` -> 2 manga URLs (examples: `.../konna-watashi-ni-nacchatta-portugues`, `.../konna-watashi-ni-nacchatta-portugues`), `https://mangaz.muitohentai.club/.../kishiou-no-kimochi-ii-ana-portugues.jpg` -> 2 manga URLs (examples: `.../kishiou-no-kimochi-ii-ana-portugues`, `.../kishiou-no-kimochi-ii-ana-portugues`), `https://mangaz.muitohentai.club/.../kareshi-ni-betabore-chuu-no-gal-senpai-ga-ore-to-tsukiau-made-be-my-girlfriend-rio-senpai-portugues.jpg` -> 2 manga URLs (examples: `.../kareshi-ni-betabore-chuu-no-gal-senpai-ga-ore-to-tsukiau-made-be-my-girlfriend-rio-senpai-portugues`, `.../kareshi-ni-betabore-chuu-no-gal-senpai-ga-ore-to-tsukiau-made-be-my-girlfriend-rio-senpai-portugues`) |  |  |  |
| thumbnail | PASS | `https://mangaz.muitohentai.club/.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues.jpg` (image/webp (container: extended), 212176 bytes, 1280x1808; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues` |  |  |  |
| details thumbnail URL | PASS | `https://mangaz.muitohentai.club/.../elegg-ni-shikikanshi-no-ochinpo-wo-nuitemorau-hanashi-portugues.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Boquete, Pau Grande, Peitos Grandes |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Sem sinopse por enquanto. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 23 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mangaz.muitohentai.club/.../2.jpg <redacted query values: nocache71>` (image/webp (container: extended), 212176 bytes, 1280x1808; server Content-Type: image/jpeg) |  |  |  |
