# Extension Validation Report

- Extension: tachiyomi-pt.muitohentai-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 33
- Lint: 2
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1062606379654091909
- Source name: Muito Hentai
- Source language: pt-BR
- Selected manga input: popular offset 0: Depois que Terminei com a Namorada e Comecei a Namorar o Melhor Amigo, Ele Veio de Cosplay e se Ofereceu (`.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Depois que Terminei com a Namorada e Comecei a Namorar o Melhor Amigo, Ele Veio de Cosplay e se Ofereceu (`.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 24 | A História de Quando Recrutei uma Dubladora de Eroge e Fodi uma Garota Extremamente Safada (`.../eroge-seiyuu-o-boshuu-shitara-mechakucha-eroi-ko-to-yareta-hanashi-portugues`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Depois que Terminei com a Namorada e Comecei a Namorar o Melhor Amigo, Ele Veio de Cosplay e se Ofereceu (`.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Haru Urara 3 (Street Fighter) (`.../haru-urara-3-portugues`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Depois que Terminei com a Namorada e Comecei a Namorar o Melhor Amigo, Ele Veio de Cosplay e se Ofereceu (`.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Depois que Terminei com a Namorada e Comecei a Namorar o Melhor Amigo, Ele Veio de Cosplay e se Ofereceu (`.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Capitulo 1 (`.../capitulo-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 37 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Depois que Terminei com a Namorada e Comecei a Namorar o Melhor Amigo, Ele Veio de Cosplay e se Ofereceu, URL=`.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://mangaz.muitohentai.club/.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues.jpg` -> 2 manga URLs (examples: `.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues`, `.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues`), `https://mangaz.muitohentai.club/.../kan-senbunnytype-portugues.jpg` -> 2 manga URLs (examples: `.../kan-senbunnytype-portugues`, `.../kan-senbunnytype-portugues`), `https://mangaz.muitohentai.club/.../kachousen-ni-portugues.jpg` -> 2 manga URLs (examples: `.../kachousen-ni-portugues`, `.../kachousen-ni-portugues`), `https://mangaz.muitohentai.club/.../ie-wa-yari-heya-portugues.jpg` -> 2 manga URLs (examples: `.../ie-wa-yari-heya-portugues`, `.../ie-wa-yari-heya-portugues`), `https://mangaz.muitohentai.club/.../kochira-taihou-03-portugues.jpg` -> 2 manga URLs (examples: `.../kochira-taihou-03-portugues`, `.../kochira-taihou-03-portugues`), `https://mangaz.muitohentai.club/.../koakuma-kei-imouto-chuuihou-portugues.jpg` -> 2 manga URLs (examples: `.../koakuma-kei-imouto-chuuihou-portugues`, `.../koakuma-kei-imouto-chuuihou-portugues`), `https://mangaz.muitohentai.club/.../konna-sukebena-karada-de-hahaoya-wa-muridaro-muboubi-sugiru-haha-de-nuki-makuru-hibi-remake-portugues.jpg` -> 2 manga URLs (examples: `.../konna-sukebena-karada-de-hahaoya-wa-muridaro-muboubi-sugiru-haha-de-nuki-makuru-hibi-remake-portugues`, `.../konna-sukebena-karada-de-hahaoya-wa-muridaro-muboubi-sugiru-haha-de-nuki-makuru-hibi-remake-portugues`), `https://mangaz.muitohentai.club/.../koitsura-ga-oretachi-no-atarashii-nakama-da-portugues.jpg` -> 2 manga URLs (examples: `.../koitsura-ga-oretachi-no-atarashii-nakama-da-portugues`, `.../koitsura-ga-oretachi-no-atarashii-nakama-da-portugues`), `https://mangaz.muitohentai.club/.../eri-to-nozomi-no-joujiroku-1-portugues.jpg` -> 2 manga URLs (examples: `.../eri-to-nozomi-no-joujiroku-1-portugues`, `.../eri-to-nozomi-no-joujiroku-1-portugues`), `https://mangaz.muitohentai.club/.../eri-to-nozomi-no-joujiroku-2-portugues.jpg` -> 2 manga URLs (examples: `.../eri-to-nozomi-no-joujiroku-2-portugues`, `.../eri-to-nozomi-no-joujiroku-2-portugues`), `https://mangaz.muitohentai.club/.../delima-3-portugues.jpg` -> 2 manga URLs (examples: `.../delima-3-portugues`, `.../delima-3-portugues`), `https://mangaz.muitohentai.club/.../gal-o-tasuketara-isekai-tenseikyuu-no-reajuu-seikatsu-ga-hajimatta-portugues.jpg` -> 2 manga URLs (examples: `.../gal-o-tasuketara-isekai-tenseikyuu-no-reajuu-seikatsu-ga-hajimatta-portugues`, `.../gal-o-tasuketara-isekai-tenseikyuu-no-reajuu-seikatsu-ga-hajimatta-portugues`), `https://mangaz.muitohentai.club/.../happy-life-portugues.jpg` -> 2 manga URLs (examples: `.../happy-life-portugues`, `.../happy-life-portugues`), `https://mangaz.muitohentai.club/.../iede-gal-na-senpai-wa-kantan-ni-yarasete-kureru-3-portugues.jpg` -> 2 manga URLs (examples: `.../iede-gal-na-senpai-wa-kantan-ni-yarasete-kureru-3-portugues`, `.../iede-gal-na-senpai-wa-kantan-ni-yarasete-kureru-3-portugues`), `https://mangaz.muitohentai.club/.../inchuu-no-seijo-portugues.jpg` -> 2 manga URLs (examples: `.../inchuu-no-seijo-portugues`, `.../inchuu-no-seijo-portugues`), `https://mangaz.muitohentai.club/.../ippai-chiyuki-portugues.jpg` -> 2 manga URLs (examples: `.../ippai-chiyuki-portugues`, `.../ippai-chiyuki-portugues`), `https://mangaz.muitohentai.club/.../jasmine-to-jessica-to-portugues.jpg` -> 2 manga URLs (examples: `.../jasmine-to-jessica-to-portugues`, `.../jasmine-to-jessica-to-portugues`), `https://mangaz.muitohentai.club/.../empty-the-witch-portugues.jpg` -> 2 manga URLs (examples: `.../empty-the-witch-portugues`, `.../empty-the-witch-portugues`), `https://mangaz.muitohentai.club/.../earnest-heart-portugues.jpg` -> 2 manga URLs (examples: `.../earnest-heart-portugues`, `.../earnest-heart-portugues`), `https://mangaz.muitohentai.club/.../delima-2-portugues.jpg` -> 2 manga URLs (examples: `.../delima-2-portugues`, `.../delima-2-portugues`), `https://mangaz.muitohentai.club/.../dekiai-kanojo-ni-chinpo-made-amayakasarete-dame-ni-narisou-portugues.jpg` -> 2 manga URLs (examples: `.../dekiai-kanojo-ni-chinpo-made-amayakasarete-dame-ni-narisou-portugues`, `.../dekiai-kanojo-ni-chinpo-made-amayakasarete-dame-ni-narisou-portugues`), `https://mangaz.muitohentai.club/.../haru-urara-2-portugues.jpg` -> 2 manga URLs (examples: `.../haru-urara-2-portugues`, `.../haru-urara-2-portugues`), `https://mangaz.muitohentai.club/.../grand-theft-samen-four-portugues.jpg` -> 2 manga URLs (examples: `.../grand-theft-samen-four-portugues`, `.../grand-theft-samen-four-portugues`) |  |  |  |
| thumbnail | PASS | `https://mangaz.muitohentai.club/.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues.jpg` (image/webp (encoding: lossy), 122934 bytes, 1280x1782; server Content-Type: image/jpeg) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues` |  |  |  |
| details thumbnail URL | PASS | `https://mangaz.muitohentai.club/.../kanojo-to-wakereta-shinyu-to-tsukiatta-ra-kosupure-shite-sashitte-kita-portugues.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Anal, Bara, Boquete, Colorido, Creampie, Masturbação, Yaoi(gay) |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Sem sinopse por enquanto. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://www.muitohentai.com/.../2` to `https://www.muitohentai.com/.../2` (2 redirects); popular: `https://www.muitohentai.com/.../capitulo-1` to `https://www.muitohentai.com/.../capitulo-1` (2 redirects); popular: `https://www.muitohentai.com/.../2` to `https://www.muitohentai.com/.../2` (2 redirects) |  |  |  |
| page load | PASS | `https://mangaz.muitohentai.club/.../2.jpg <redacted query values: nocache49>` (image/webp (encoding: lossy), 342072 bytes, 1280x1816; server Content-Type: image/jpeg) |  |  |  |
